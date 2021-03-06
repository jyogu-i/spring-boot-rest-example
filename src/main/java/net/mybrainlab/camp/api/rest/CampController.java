package net.mybrainlab.camp.api.rest;

import static java.util.Objects.*;

import net.mybrainlab.camp.common.SimpleTemplateEngin;
import net.mybrainlab.camp.common.Utils;
import net.mybrainlab.camp.dao.entity.*;
import net.mybrainlab.camp.repository.*;
import io.swagger.annotations.Api;
import org.codehaus.jackson.map.ObjectMapper;
import org.python.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.ResourceLoader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.codec.binary.Base64;

// コントローラークラスだよっていうおまじない
@RestController
@RequestMapping(value = "/v1/api/camp")
@Api(tags = {"camp"})
public class CampController extends AbstractRestHandler {

    @Autowired
    private ResourceLoader resourceLoader;

//    @Autowired
//    private CampService campService;

    @Autowired
    private CaRepository caRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QaRepository qaRepository;

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private UserHopeRepository userhopeRepository;

    @Autowired
    private UserPreviousRepository userpreviousRepository;

    @Autowired
    private AcademicRepository academicRepository;

    @Autowired
    private EnglishRepository englishRepository;

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private IndustryRepository industryRepository;

    @Autowired
    private JobCategoryRepository jobcategoryRepository;

    @Autowired
    private MajorRepository majorRepository;

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private TermRepository termRepository;

    @Autowired
    private TimesRepository timesRepository;

    @Autowired
    private TimingRepository timingRepository;

    @Autowired
    private WorkRepository workRepository;

    @Autowired
    private CaResultJobCategoryRepository caresultjobcategoryRepository;

    @Autowired
    private CaResultCompanyRepository caresultcompanyRepository;

    @Autowired
    private CaResultIndustryRepository caresultindustryRepository;

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ScaleNumberRepository scalenumberRepository;

    @Autowired
    private ScaleTypeRepository scaletypeRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private UserReviewRepository userreviewRepository;

    @Autowired
    private TosRepository tosRepository;

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    // お問い合わせメール用の設定
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private PasswordEncoder passwordEncoder;

//    CampController(JavaMailSender javaMailSender, PasswordEncoder passwordEncoder) {
//        this.javaMailSender = javaMailSender;
//        this.passwordEncoder = passwordEncoder;
//    }

    // welcome画面
    @RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List welcome() throws Exception {
        List welcome = genderRepository.selectAll();
        welcome.add(academicRepository.selectAll());
        welcome.add(englishRepository.selectAll());
        welcome.add(industryRepository.selectBig());
        welcome.add(industryRepository.selectMiddle());
        welcome.add(industryRepository.selectSmall());
        welcome.add(jobcategoryRepository.selectBig());
        welcome.add(jobcategoryRepository.selectMiddle());
        welcome.add(jobcategoryRepository.selectSmall());
        welcome.add(majorRepository.selectAll());
        welcome.add(placeRepository.selectAll());
        welcome.add(termRepository.selectAll());
        welcome.add(timingRepository.selectAll());
        welcome.add(timesRepository.selectAll());
        welcome.add(workRepository.selectAll());
        welcome.add(scalenumberRepository.selectAll());
        welcome.add(scaletypeRepository.selectAll());
        BufferedInputStream bis = null;
        try {
            final URL url =
                    new URL("http://careerup-camp.jp.s3.amazonaws.com/tutrial/" + "Top.jpg");
            final URL url2 =
                    new URL("http://careerup-camp.jp.s3.amazonaws.com/tutrial/" + "camp_char.png");
            final URL url3 =
                    new URL("http://careerup-camp.jp.s3.amazonaws.com/tutrial/" + "FB-f-Logo__white_29.png");

            bis = new BufferedInputStream(url.openStream());
            final String base64 =
                    new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
            welcome.add("data:image/jpg;base64," + base64);

            bis = new BufferedInputStream(url2.openStream());
            final String base642 =
                    new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
            welcome.add("data:image/png;base64," + base642);

            bis = new BufferedInputStream(url3.openStream());
            final String base643 =
                    new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
            welcome.add("data:image/png;base64," + base643);
        } finally {
            bis.close();
        }
        return welcome;
    }

    // 個人情報規約画面
    @RequestMapping(value = "/personal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List personal() throws Exception {
        List personalLists = personalInfoRepository.selectAll();

        return personalLists;
    }

    // 利用規約画面
    @RequestMapping(value = "/tos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List tos() throws Exception {
        // TosDBに接続して値を取得
        List tos = tosRepository.selectAll();
        return tos;
    }

    // ログイン画面
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List login(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User mailpass = mapper.readValue(json, User.class);
        User user = userRepository.selectMailPass(mailpass);

        List info = new ArrayList();
        if (user == null) {
            info.add("error");
            return info;
        } else if (passwordEncoder.matches(mailpass.getPassword(), user.getPassword())) {
            info.add(user.getUserId());
            info.add(user.getMailcheck());
            return info;
        } else {
            info.add("error");
            return info;
        }
    }

    // ユーザとマッチング→CAにメールを送信
    public void maching_mail(Chat chat) throws Exception {
        Ca ca = caRepository.selectDetail(chat);
        AllUerInfo profile = userRepository.selectMyprofile(chat);

        profile.setIncome(nullcheck(profile.getIncome()));
        System.out.println("年収" + profile.getIncome());
        switch (profile.getIncome()) {
            case "0":
                profile.setIncome("300万以上〜");
                break;
            case "1":
                profile.setIncome("400万以上〜");
                break;
            case "2":
                profile.setIncome("500万以上〜");
                break;
            case "3":
                profile.setIncome("600万以上〜");
                break;
            case "4":
                profile.setIncome("700万以上〜");
                break;
            case "5":
                profile.setIncome("800万以上〜");
                break;
            case "6":
                profile.setIncome("900万以上〜");
                break;
            case "7":
                profile.setIncome("1000万以上〜");
                break;
        }

        profile.setName(nullcheck(profile.getName()));
        profile.setYomigana(nullcheck(profile.getYomigana()));
        profile.sethCompanyName(nullcheck(profile.gethCompanyName()));

        profile.setScaleTypeId(nullcheck(profile.getScaleTypeId()));
        switch (profile.getScaleTypeId()) {
            case "0":
                profile.setScaleTypeId("スタートアップ");
                break;
            case "1":
                profile.setScaleTypeId("ベンチャー");
                break;
            case "2":
                profile.setScaleTypeId("大手");
                break;
            case "3":
                profile.setScaleTypeId("こだわらない");
                break;
        }

        profile.setWorkId(nullcheck(profile.getWorkId()));
        switch (profile.getWorkId()) {
            case "0":
                profile.setWorkId("キャリアアップができる職場選び");
                break;
            case "1":
                profile.setWorkId("様々な求人・企業から自分に合う環境を見つけること");
                break;
            case "2":
                profile.setWorkId("スピーディーに内定までを決めること");
                break;
            case "3":
                profile.setWorkId("面接や書類審査の対策");
                break;
        }

        profile.setPlaceId(nullcheck(profile.getPlaceId()));
        switch (profile.getPlaceId()) {
            case "0":
                profile.setPlaceId("首都圏");
                break;
            case "1":
                profile.setPlaceId("北海道・東北");
                break;
            case "2":
                profile.setPlaceId("北陸・甲信越");
                break;
            case "3":
                profile.setPlaceId("東海・中部");
                break;
            case "4":
                profile.setPlaceId("近畿");
                break;
            case "5":
                profile.setPlaceId("中国・四国");
                break;
            case "6":
                profile.setPlaceId("九州");
                break;
            case "7":
                profile.setPlaceId("こだわらない");
                break;
        }

        profile.setSkill(nullcheck(profile.getSkill()));

        profile.setTermId(nullcheck(profile.getTermId()));
        switch (profile.getTermId()) {
            case "0":
                profile.setTermId("就業中");
                break;
            case "1":
                profile.setTermId("1ヶ月以内");
                break;
            case "2":
                profile.setTermId("3ヶ月以内");
                break;
            case "3":
                profile.setTermId("6ヶ月以内");
                break;
            case "4":
                profile.setTermId("1年以内");
                break;
            case "5":
                profile.setTermId("1年以上");
                break;
        }

        profile.setTimingId(nullcheck(profile.getTimingId()));
        switch (profile.getTimingId()) {
            case "0":
                profile.setTimingId("すぐにでも");
                break;
            case "1":
                profile.setTimingId("3ヶ月以内");
                break;
            case "2":
                profile.setTimingId("6ヶ月以内");
                break;
            case "3":
                profile.setTimingId("1年以内");
                break;
            case "4":
                profile.setTimingId("良い求人があれば");
                break;
            case "5":
                profile.setTimingId("未定");
                break;
        }

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        // メアドが存在すれば送る
        if(ca.getCaMail()!=null) {
            mailMessage.setTo(ca.getCaMail());
            System.out.println("送ったCAのメール" + ca.getCaMail());
            //mailMessage.setReplyTo("リプライのメールアドレス");
            mailMessage.setFrom("noreply@careerup-camp.jp");
            mailMessage.setSubject("【CONNECT】求職者のリコメンド");
            mailMessage.setText(ca.getCaName() + "様" + "\nお世話になっております。" + "CONNECT運営事務局でございます。"
                    + "\nユーザーID：" + chat.getUserId() + "様をリコメンド致します。\n以下ユーザー情報"
                    + "\n\n#################################\n"
                    + "\nユーザーID：" + chat.getUserId() + "\n性別：" + profile.getGender() + "\n年齢：" + profile.getAge()
                    + "\n学歴：" + profile.getSchool() + "\n専攻：" + profile.getMajor() + "\n転職回数：" + profile.getTimes()
                    + "\n英語力：" + profile.getEnglish() + "\n転職期間：" + profile.getTermId() + "\n転職タイミング：" + profile.getTimingId()
                    + "\n資格：" + profile.getSkill() + "\n直近の企業名：" + profile.getPCompanyName() + "\n入社年度：" + profile.getJoinedYear()
                    + "\n希望企業名：" + profile.gethCompanyName()
                    + "\n希望業界：" + profile.getBigIndustry() + "\n>" + profile.getMiddleIndustry() + "\n>>" + profile.getSmallIndustry()
                    + "\n希望職種：" + profile.getBigCategory() + "\n>" + profile.getMiddleCategory() + "\n>>" + profile.getSmallCategory()
                    + "\n希望年収：" + profile.getIncome() + "\n希望勤務地：" + profile.getPlaceId() + "\n希望企業規模：" + profile.getScaleNumber()
                    + "\n希望企業タイプ：" + profile.getScaleTypeId() + "\n転職に求めるもの：" + profile.getWorkId()
                    + "\n#################################\n\n"
                    + "\nお問い合わせは下記までお願い致します。" + "\nCONNECT事務局\ntel：03-6432-0874\nmail：agent-info@career-connect.jp\n担当者：山下・秋元"
            );

            // 下のコメント外すと本当にCAにメール送られます
            javaMailSender.send(mailMessage);
        }
    }

    private Function<String, User> getAccountById = userId -> {
        User user = new User();
        user.setUserId(userId);
        return userRepository.selectAccount(user);
    };

    /**
     * カテゴリデータからIDをビルドする.
     * @param args カテゴリデータ
     * @return {@link String}
     */
    private String generatCategoryId(final String...args) {
        final String concateId = Stream.of(args)
                .peek(Utils::trim)
                .collect(Collectors.joining());
        return nonNull(concateId) && concateId.length() > 0 ? concateId : null;
    }

    /**
     * 基本情報をMappingする.
     * @param userId ID
     * @param dataType 変換タイプ
     * @param mapper MapperObj
     * @throws IOException
     */
    private void insertBasicInfo(final String userId, final String dataType, ObjectMapper mapper) throws IOException {
        Basic basic = mapper.readValue(dataType, Basic.class);

        // 基本：個人情報
        User user = mappingUserInfo(userId, dataType, mapper);
        userRepository.insertBasicUser(user);
        // 基本：経験企業
        UserPrevious previous = mappingPreviousInfo(userId, dataType, mapper);
        userpreviousRepository.insertBasicUserPrevious(previous);
        // 基本：希望
        UserHope userhope = mappingHopeInfo(userId, dataType, mapper);
        userhope.setScaleNumberId("6"); // 一旦６にする
        userhopeRepository.insertBasicUserHope(userhope);
    }

    /**
     * 基本情報をMappingする.
     * @param userId ID
     * @param dataType 変換タイプ
     * @param mapper MapperObj
     * @throws IOException
     */
    private void updateOptionInfo(final String userId, final String dataType, ObjectMapper mapper) throws IOException {
        Option option = mapper.readValue(dataType, Option.class);

        // ユーザオプション
        User user = userRepository.selectByUserId(userId);
        user.setSkill(option.getSkill());
        user.setEnglishId(Utils.trim(option.getEnglish()));
        user.setTimingId(Utils.trim(option.getTiming()));
        user.setTimesId(Utils.trim(option.getTimes()));
        userRepository.updateOption(user);

        // ユーザ希望オプション
        UserHope userhope = userhopeRepository.selectByUserId(userId);
        userhope.setIncome(option.getIncome());
        userhope.setPlaceId(Utils.trim(option.getPlace()));
        userhope.setScaleNumberId(Utils.trim(option.getScaleNumber()));
        userhope.setScaleTypeId(Utils.trim(option.getScaleType()));
        userhope.setWorkId(Utils.trim(option.getWork()));
        userhopeRepository.updateOption(userhope);
    }

    /**
     * ユーザ情報をMappingする.
     * @param userId ID
     * @param dataType 変換タイプ
     * @param mapper MapperObj
     * @return {@linkplain User}
     * @throws IOException
     */
    private User mappingUserInfo(final String userId, final String dataType, ObjectMapper mapper) throws IOException {
        User user = new User();
        user.setUserId(userId);
        Basic basic = mapper.readValue(dataType, Basic.class);
        // ユーザ情報
        user.setName(Utils.trim(basic.getName()));
        user.setGenderId(Utils.trim(basic.getGender().trim()));
        user.setAge(basic.getAge());
        // 学歴
        user.setSchool(Utils.trim(basic.getSchool()));
        user.setMajorId(Utils.trim(basic.getMajor().trim()));
        user.setGraduationYear(basic.getGraduation_year());

        return user;
    }

    /**
     * 経験企業情報をMappingする.
     * @param userId ID
     * @param dataType 変換タイプ
     * @param mapper MapperObj
     * @return {@linkplain UserPrevious}
     * @throws IOException
     */
    private UserPrevious mappingPreviousInfo(final String userId, final String dataType, ObjectMapper mapper) throws IOException {
        UserPrevious userprevious = new UserPrevious();
        userprevious.setUserId(userId);
        Basic basic = mapper.readValue(dataType, Basic.class);
        // 経験企業情報
        userprevious.setCompanyName(Utils.trim(basic.getP_company_name()));
        userprevious.setIndustryId(generatCategoryId(basic.getP_industry(), basic.getP_industry_middle(), basic.getP_industry_small()));
        userprevious.setJobCategoryId(generatCategoryId(basic.getP_job_category(), basic.getP_job_category_middle(), basic.getP_job_category_small()));
        userprevious.setJoinedYear(basic.getJoined_year());
        userprevious.setLeavingYear(basic.getLeaving_year());

        return userprevious;
    }

    /**
     * 希望情報をMappingする.
     * @param userId ID
     * @param dataType 変換タイプ
     * @param mapper MapperObj
     * @return {@linkplain UserHope}
     * @throws IOException
     */
    private UserHope mappingHopeInfo(final String userId, final String dataType, ObjectMapper mapper) throws IOException {
        UserHope userhope = new UserHope();
        userhope.setUserId(userId);
        Basic basic = mapper.readValue(dataType, Basic.class);
        // 希望情報
        userhope.setIndustryId(generatCategoryId(basic.getH_industry(), basic.getH_industry_middle(), basic.getH_industry_small()));
        userhope.setJobCategoryId(generatCategoryId(basic.getH_job_category(), basic.getH_job_category_middle(), basic.getH_job_category_small()));

        return userhope;
    }

    public void python(String user_id, String industry, String job_category, String company) throws IOException {
        Chat chat = new Chat();
        chat.setUserId(user_id);
        //上は本番環境でやるとき、下はローカルでやるとき
        String[] cmd = {"/usr/bin/python3", "/opt/SyncQueue/match.py", industry, job_category, company};
        //String[] cmd = {"/Users/sekipon/anaconda3/bin/python3", "docker/camp/match.py", industry, job_category, company};

        ProcessBuilder pb = new ProcessBuilder(cmd);
        Process proc = pb.start();

        String str;

        //　エラーの場合
        BufferedReader brerr = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        while ((str = brerr.readLine()) != null) {
            System.err.println(str);
        }
        brerr.close();

        BufferedReader brstd = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        while ((str = brstd.readLine()) != null) {
            // 配列を分解
            String[] fruit = str.split(",", 0);
            System.err.println(str);
            for (int i = 0; i < fruit.length; i = i + 2) {
                chat.setCaId(fruit[i]);
                chat.setScore(Integer.parseInt(fruit[i + 1]));
                System.out.println("id==" + chat.getCaId());
                System.out.println("score==" + chat.getScore());
                chatRepository.insert(chat);

                try {
                    maching_mail(chat);
                } catch (Exception e) {
                    System.out.print("メール送信できませんでした");
                }
            }
        }
        brstd.close();

    }

    public String nullcheck(String str) throws Exception {
        if (str == null) {
            str = "未入力";
        }
        return str;
    }

    public String trimSpace(String str) {
        str = str.replace(" ", "");
        str = str.replace("　", "");
        str.trim();

        return str;
    }

    // 初期登録画面
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/{user_id}/question/basic", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void basic(@PathVariable String userId, @RequestBody String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // 基本情報の格納
        insertBasicInfo(userId, json, mapper);

        UserHope userHope = userhopeRepository.selectByUserId(userId);
        if (nonNull(userHope)) {
            //AIシステムへ
            python(userId, userHope.getIndustryId(), userHope.getJobCategoryId(), "");
        }
    }

    // オプション登録画面
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/{user_id}/question/option", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void option(@RequestBody String json, @PathVariable String userId) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // 基本情報の格納
        insertBasicInfo(userId, json, mapper);
        // オプション情報の格納
        updateOptionInfo(userId, json, mapper);

        UserHope userHope = userhopeRepository.selectByUserId(userId);
        if (nonNull(userHope)) {
            //AIシステムへ
            python(userId, userHope.getIndustryId(), userHope.getJobCategoryId(), userHope.getCompanyName());
        }

    }

    // 新規登録画面-アカウント
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/{user_id}/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String signup(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User signup = mapper.readValue(json, User.class);
        signup.setUserId(user_id);
        // パスワードをハッシュ化
        signup.setPassword(passwordEncoder.encode(signup.getPassword()));
        User check = userRepository.selectCheckMail(signup);

        if (check == null) {
            // トークン発行
            Random rnd = new Random();
            int ran = rnd.nextInt(899999) + 100000;
            signup.setToken(ran);

            // パスワード・トークン・メアド・ユーザIDをまとめてDBへ登録
            userRepository.insertAccount(signup);

            // ユーザにメール送信する
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setTo(signup.getMail());
            mailMessage.setFrom("noreply@careerup-camp.jp");
            mailMessage.setSubject("CONNECTメールアドレス認証");
            mailMessage.setText("この度はCONNECTへのご登録ありがとうございます。\n" +
                    "メール認証を行うため、以下の番号をご登録中の画面へご入力お願いいたします。。\n" +
                    ran + "\n\nお心当たりのない方は誠に恐れ入りますが、下記までご連絡ください。\n" +
                    "株式会社ブレイン・ラボ　tel:03-6432-0874　CONNECTアプリ担当");
            javaMailSender.send(mailMessage);

            return "OK";
        } else {
            return "error";
        }

    }

    // マイプロフィール画面 プロフィール一覧をフロントに送信
    @RequestMapping(value = "/{user_id}/myprofile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List user_list(@PathVariable String user_id) throws Exception {
        User user = new User();
        user.setUserId(user_id);

        UserHope userhope = new UserHope();
        userhope.setUserId(user_id);
        List userhopeList = new ArrayList();

        UserPrevious userprevious = new UserPrevious();
        userprevious.setUserId(user_id);

        List userList = userRepository.selectUser(user);
        userList.add(userhopeRepository.selectMyprofile(userhope));
        userList.add(userpreviousRepository.selectMyprofile(userprevious));

        return userList;

    }

    // マイプロフィール登録画面　新しく登録し直す
    @RequestMapping(value = "/{user_id}/myprofile", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void myprofile(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Myprofile myprofile = mapper.readValue(json, Myprofile.class);

        UserHope userhope = new UserHope();
        userhope.setUserId(user_id);
        userhope.setIndustryId(trimSpace(myprofile.getH_industry() + myprofile.getH_industry_middle() + myprofile.getH_industry_small()));
        if (myprofile.getPlaceId() != null) {
            userhope.setPlaceId(trimSpace(myprofile.getPlaceId()));
        }
        if (myprofile.getH_company_name() == null) {
            userhope.setCompanyName("");
        } else {
            userhope.setCompanyName(myprofile.getH_company_name());
        }
        if (myprofile.getIncome() != null) {
            userhope.setIncome(trimSpace(myprofile.getIncome()));
        }
        if (myprofile.getWorkId() != null) {
            userhope.setWorkId(trimSpace(myprofile.getWorkId()));
        }
        if (myprofile.getScaleTypeId() != null) {
            userhope.setScaleTypeId(trimSpace(myprofile.getScaleTypeId()));
        }
        if (myprofile.getScaleNumberId() != null) {
            userhope.setScaleNumberId(myprofile.getScaleNumberId());
        } else {
            userhope.setScaleNumberId("6");
        }
        userhope.setJobCategoryId(trimSpace(myprofile.getH_job_category() + myprofile.getH_job_category_middle() + myprofile.getH_job_category_small()));
        //userhopeRepository.updateMyprofileUserHope(userhope);
        userhopeRepository.delete(userhope);
        userhopeRepository.insertOptionUserHope(userhope);

        //会社の数だけ繰り返すfor文
        //previous_idだけはAutoIncrementで生成しているので、更新時は前のものは全てDeleteし、新しくinsertする
        UserPrevious userprevious = new UserPrevious();
        userprevious.setUserId(user_id);
        userpreviousRepository.delete(userprevious);

        userprevious.setIndustryId(trimSpace(myprofile.getP_industry() + myprofile.getP_industry_middle() + myprofile.getP_industry_small()));
        userprevious.setCompanyName(myprofile.getP_company_name());
        userprevious.setJobCategoryId(trimSpace(myprofile.getP_job_category() + myprofile.getP_job_category_middle() + myprofile.getP_job_category_small()));
        userprevious.setJoinedYear(myprofile.getJoinedYear());
        userpreviousRepository.insertOptionUserPrevious(userprevious);

        User user = new User();
        user.setUserId(user_id);
        user.setAcademicId("なし");
        user.setAge(myprofile.getAge());
        user.setEnglishId(trimSpace(myprofile.getEnglishId()));
        user.setGenderId(trimSpace(myprofile.getGender()));
        user.setMajorId(trimSpace(myprofile.getMajor()));
        user.setSchool(myprofile.getSchool());
        if (myprofile.getTimingId() == null) {
            myprofile.setTimingId("");
        }
        user.setTimingId(trimSpace(myprofile.getTimingId()));
        if (myprofile.getTermId() != null) {
            user.setTermId(trimSpace(myprofile.getTermId()));
        }
        user.setTimesId(myprofile.getTimesId());
        if (myprofile.getSkill() == null) {
            user.setSkill("");
        } else {
            user.setSkill(myprofile.getSkill());
        }
        user.setName(myprofile.getName());
        user.setYomigana(myprofile.getYomigana());
        userRepository.updateMyprofileUser(user);

        python(user_id, userhope.getIndustryId(), userhope.getJobCategoryId(), userhope.getCompanyName());

    }

    // アカウント画面
    @RequestMapping(value = "/{user_id}/account", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User account(@PathVariable String user_id) throws IOException {
        User user = new User();
        user.setUserId(user_id);
        return userRepository.selectAccount(user);
    }

    // アカウント画面
    @RequestMapping(value = "/{user_id}/account", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String account(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User account = mapper.readValue(json, User.class);
        account.setUserId(user_id);
        System.out.println("json" + json);

        // ユーザがしたい動作を確認。結果がnullならメアドも更新したい。notnullならパスワードだけ変えたい。
        User docheck = userRepository.selectCheckAccountDo(account);

        // パスワードだけ変えたい
        if (docheck != null) {
            // パスワードが空かチェック
            if (account.getPassword().isEmpty() == false) {
                User user = userRepository.selectAccount(account);
                // 旧パスワードの正当性を確認
                if (passwordEncoder.matches(account.getOld_password(), user.getPassword())) {
                    // パスワードをハッシュ化
                    account.setPassword(passwordEncoder.encode(account.getPassword()));
                    userRepository.updateAllAccount(account);
                    return "パスワードの更新が完了しました";
                }
                return "旧パスワードが正しくありません";
            }
            return "変更項目を入力してください";
        }
        // メアドも変えたい
        else {
            // 更新しようとしているアドレスがユニークかどうかチェック
            User mailcheck = userRepository.selectMailPass(account);
            if (mailcheck != null) {
                return "このアドレスはすでに登録されています";
            }
            // 受け取ったJSONにパスワードが入っていたら新しいパスワードも登録
            else if (account.getPassword().isEmpty() == false) {
                User user = userRepository.selectAccount(account);
                // 旧パスワードの正当性を確認
                if (passwordEncoder.matches(account.getOld_password(), user.getPassword())) {
                    // パスワードをハッシュ化
                    account.setPassword(passwordEncoder.encode(account.getPassword()));
                    userRepository.updateAllAccount(account);
                    // トークン発行
                    Random rnd = new Random();
                    int ran = rnd.nextInt(899999) + 100000;
                    account.setToken(ran);

                    // トークンをDBへ登録
                    userRepository.updateToken(account);

                    // ユーザにメール送信する
                    SimpleMailMessage mailMessage = new SimpleMailMessage();

                    mailMessage.setTo(account.getMail());
                    mailMessage.setFrom("noreply@careerup-camp.jp");
                    mailMessage.setSubject("CONNECTメールアドレス認証");
                    mailMessage.setText("この度はCONNECTへのご登録ありがとうございます。\n" +
                            "メール認証を行うため、以下の番号をアプリで入力してください。\n" +
                            ran + "\n\nお心当たりのない方は誠に恐れ入りますが、下記までご連絡ください。\n" +
                            "株式会社ブレイン・ラボ　tel:03-6432-0874　CONNECTアプリ担当");
                    javaMailSender.send(mailMessage);

                    // flgを0に書き換える
                    account.setMailcheck(0);
                    userRepository.updateMailCheck(account);

                    return "アドレス・パスワードの更新が完了しました";
                }
                return "旧パスワードが正しくありません";
            } else {
                // メアドのみ更新
                userRepository.updateMailAccount(account);

                // トークン発行
                Random rnd = new Random();
                int ran = rnd.nextInt(899999) + 100000;
                account.setToken(ran);

                // トークンをDBへ登録
                userRepository.updateToken(account);

                // ユーザにメール送信する
                SimpleMailMessage mailMessage = new SimpleMailMessage();

                mailMessage.setTo(account.getMail());
                mailMessage.setFrom("noreply@careerup-camp.jp");
                mailMessage.setSubject("CONNECTメールアドレス認証");
                mailMessage.setText("この度はCONNECTへのご登録ありがとうございます。\n" +
                        "メール認証を行うため、以下の番号をアプリで入力してください。\n" +
                        ran + "\n\nお心当たりのない方は誠に恐れ入りますが、下記までご連絡ください。\n" +
                        "株式会社ブレイン・ラボ　tel:03-6432-0874　CONNECTアプリ担当");
                javaMailSender.send(mailMessage);

                // flgを0に書き換える
                account.setMailcheck(0);
                userRepository.updateMailCheck(account);

                return "アドレス更新が完了しました";
            }
        }
    }

    // 再メール認証-トークン発行&メール送信
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/{user_id}/mailauth", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void mailauth(@PathVariable String user_id) throws IOException {
        User user = new User();
        user.setUserId(user_id);
        User account = userRepository.selectAccount(user);

        // トークン発行
        Random rnd = new Random();
        int ran = rnd.nextInt(899999) + 100000;
        account.setToken(ran);

        // トークンをDBへ登録
        userRepository.updateToken(account);

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(account.getMail());
        mailMessage.setFrom("noreply@careerup-camp.jp");
        mailMessage.setSubject("CONNECTメールアドレス認証");
        mailMessage.setText("この度はCONNECTへのご登録ありがとうございます。\n" +
                "メール認証を行うため、以下の番号をアプリで入力してください。\n" +
                ran + "\n\nお心当たりのない方は誠に恐れ入りますが、下記までご連絡ください。\n" +
                "株式会社ブレイン・ラボ　tel:03-6432-0874　CONNECTアプリ担当");

        javaMailSender.send(mailMessage);
    }

    // トークン発行&メール送信

    /**
     * パスワードリマインドのため、トークン発行とメール送信
     *
     * @param json
     * @throws IOException
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/accountforget", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void accountForget(@RequestBody String json) throws IOException {
        final int offsetHours = 24;

        ObjectMapper mapper = new ObjectMapper();
        User tmpUser = mapper.readValue(json, User.class);

        // get account
        User account = userRepository.selectAccountByMail(tmpUser.getMail());

        // create token and update token and expire date.
        Random rnd = new Random();
        final int ran = rnd.nextInt(899999) + 100000;
        account.setToken(ran);
        account.setTokenExpire(Utils.getDateOffsetHours(offsetHours));

        // トークンをDBへ登録
        userRepository.updateToken(account);

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(account.getMail());
        mailMessage.setFrom("noreply@careerup-camp.jp");
        mailMessage.setSubject("CONNECTメールアドレス認証");
        final String passCode = Integer.toString(account.getToken());

        SimpleTemplateEngin ste = new SimpleTemplateEngin();
        ste.loadTemplate("templates/mailauth.txt");
        ste.add("token", account.getToken());
        ste.add("expireDate", account.getTokenExpire());
        String message = ste.buildTemplate();
        message = isNull(message)
                ? passCode : message.replaceAll("token", passCode);
        mailMessage.setText(message);
        javaMailSender.send(mailMessage);
    }

    // メール認証-トークンチェック
    @RequestMapping(value = "/{user_id}/tokencheck", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String tokencheck(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User signup = mapper.readValue(json, User.class);
        signup.setUserId(user_id);

        // 入力されたトークンが発行したmailものと一致しているかチェック
        User token = userRepository.selectCheckToken(signup);

        // 一致して入ればmailcheckフラグを更新し、OKを返す
        if (token.getToken() == signup.getToken()) {
            // フラグ更新
            signup.setMailcheck(1);
            userRepository.updateMailCheck(signup);
            return "OK";
        }
        // 一致していないのでerrorを返す
        else {
            return "error";
        }
    }

    // お問い合わせメール
    @RequestMapping(value = "/{user_id}/contact", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String contact(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Contact contact = mapper.readValue(json, Contact.class);

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo("user-info@career-connect.jp");
        //mailMessage.setReplyTo("リプライのメールアドレス");
        mailMessage.setFrom("noreply@careerup-camp.jp");
        mailMessage.setSubject(user_id + "様からのお問い合わせ");
        mailMessage.setText("ユーザID：" + user_id + "様からのお問い合わせを頂きました。\n以下本文" +
                "\n#################################\n\n" + contact.getContactMessage());

        javaMailSender.send(mailMessage);

        return "お問い合わせが完了しました。\n事務局からの返信をお待ちくださいませ。";
    }

    // ユーザからの評価画面 だいぶ先まで登場しなさそう...
    @RequestMapping(value = "/{user_id}/review", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void review(@RequestBody String json, @PathVariable String user_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        UserReview userreview = mapper.readValue(json, UserReview.class);
        userreview.setUserId(user_id);
        userreview.setCaId(userreview.getCaId());
        userreview.setInterview(userreview.getInterview());
        userreview.setReviewCompany(userreview.getReviewCompany());
        userreview.setSelection(userreview.getSelection());
        userreview.setSynthesis(userreview.getSynthesis());
        userreview.setReviewMessage(userreview.getReviewMessage());
        userreviewRepository.insert(userreview);
    }

    // ca一覧 chatテーブルにいるCAさんの一覧情報を全て返す(flg=2)
    @RequestMapping(value = "/{user_id}/ca", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_list(@PathVariable String user_id,
                        HttpServletRequest request, HttpServletResponse response) throws Exception {
        Chat chat = new Chat();
        chat.setUserId(user_id);
        List<Ca> caList = caRepository.selectCaLists(chat);

        // caの写真をbase64で変換
        for (Ca _ca : caList) {
            if (_ca.getCaImg() != null) {
                BufferedInputStream bis = null;
                try {
                    final URL url =
                            new URL("http://careerup-camp.jp.s3.amazonaws.com/CA_img/" + _ca.getCaImg());
                    String type = null;
                    if (_ca.getCaImg().matches(".*png.*")) {
                        type = "png";
                    } else if (_ca.getCaImg().matches(".*jpg.*")) {
                        type = "jpg";
                    } else if (_ca.getCaImg().matches(".*gif.*")) {
                        type = "gif";
                    }

                    bis = new BufferedInputStream(url.openStream());

                    final String base64 =
                            new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
                    _ca.setCaImg("data:image/" + type + ";base64," + base64);
                } finally {
                    bis.close();
                }
            }
        }
        return caList;
    }

    // お気に入り登録
    @RequestMapping(value = "/{user_id}/ca/{ca_id}/favo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void favo_post(@RequestBody String json, @PathVariable String user_id, @PathVariable String ca_id) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Chat chat = mapper.readValue(json, Chat.class);

        chat.setUserId(user_id);
        chat.setCaId(ca_id);

        chatRepository.updateFavo(chat);

        Ca ca = caRepository.selectDetail(chat);
        AllUerInfo profile = userRepository.selectMyprofile(chat);

        if (chat.getFavo() == 1) {
            profile.setIncome(nullcheck(profile.getIncome()));
            System.out.println("年収" + profile.getIncome());
            switch (profile.getIncome()) {
                case "0":
                    profile.setIncome("300万以上〜");
                    break;
                case "1":
                    profile.setIncome("400万以上〜");
                    break;
                case "2":
                    profile.setIncome("500万以上〜");
                    break;
                case "3":
                    profile.setIncome("600万以上〜");
                    break;
                case "4":
                    profile.setIncome("700万以上〜");
                    break;
                case "5":
                    profile.setIncome("800万以上〜");
                    break;
                case "6":
                    profile.setIncome("900万以上〜");
                    break;
                case "7":
                    profile.setIncome("1000万以上〜");
                    break;
            }

            profile.setName(nullcheck(profile.getName()));
            profile.setYomigana(nullcheck(profile.getYomigana()));
            profile.sethCompanyName(nullcheck(profile.gethCompanyName()));

            profile.setScaleTypeId(nullcheck(profile.getScaleTypeId()));
            switch (profile.getScaleTypeId()) {
                case "0":
                    profile.setScaleTypeId("スタートアップ");
                    break;
                case "1":
                    profile.setScaleTypeId("ベンチャー");
                    break;
                case "2":
                    profile.setScaleTypeId("大手");
                    break;
                case "3":
                    profile.setScaleTypeId("こだわらない");
                    break;
            }

            profile.setWorkId(nullcheck(profile.getWorkId()));
            switch (profile.getWorkId()) {
                case "0":
                    profile.setWorkId("キャリアアップができる職場選び");
                    break;
                case "1":
                    profile.setWorkId("様々な求人・企業から自分に合う環境を見つけること");
                    break;
                case "2":
                    profile.setWorkId("スピーディーに内定までを決めること");
                    break;
                case "3":
                    profile.setWorkId("面接や書類審査の対策");
                    break;
            }

            profile.setPlaceId(nullcheck(profile.getPlaceId()));
            switch (profile.getPlaceId()) {
                case "0":
                    profile.setPlaceId("首都圏");
                    break;
                case "1":
                    profile.setPlaceId("北海道・東北");
                    break;
                case "2":
                    profile.setPlaceId("北陸・甲信越");
                    break;
                case "3":
                    profile.setPlaceId("東海・中部");
                    break;
                case "4":
                    profile.setPlaceId("近畿");
                    break;
                case "5":
                    profile.setPlaceId("中国・四国");
                    break;
                case "6":
                    profile.setPlaceId("九州");
                    break;
                case "7":
                    profile.setPlaceId("こだわらない");
                    break;
            }

            profile.setSkill(nullcheck(profile.getSkill()));

            profile.setTermId(nullcheck(profile.getTermId()));
            switch (profile.getTermId()) {
                case "0":
                    profile.setTermId("就業中");
                    break;
                case "1":
                    profile.setTermId("1ヶ月以内");
                    break;
                case "2":
                    profile.setTermId("3ヶ月以内");
                    break;
                case "3":
                    profile.setTermId("6ヶ月以内");
                    break;
                case "4":
                    profile.setTermId("1年以内");
                    break;
                case "5":
                    profile.setTermId("1年以上");
                    break;
            }

            profile.setTimingId(nullcheck(profile.getTimingId()));
            switch (profile.getTimingId()) {
                case "0":
                    profile.setTimingId("すぐにでも");
                    break;
                case "1":
                    profile.setTimingId("3ヶ月以内");
                    break;
                case "2":
                    profile.setTimingId("6ヶ月以内");
                    break;
                case "3":
                    profile.setTimingId("1年以内");
                    break;
                case "4":
                    profile.setTimingId("良い求人があれば");
                    break;
                case "5":
                    profile.setTimingId("未定");
                    break;
            }

            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // メアドが存在すれば送る
            if(ca.getCaMail()!=null) {
                mailMessage.setTo(ca.getCaMail());
                System.out.println("送ったCAのメール" + ca.getCaMail());
                //mailMessage.setTo("m.sekine@mybrainlab.net");
                //mailMessage.setReplyTo("リプライのメールアドレス");
                mailMessage.setFrom("noreply@careerup-camp.jp");
                // BL管理者をBCC
                mailMessage.setBcc("NoReply@brainlab.co.jp");
                mailMessage.setSubject("【CONNECT】新規マッチングのお知らせtest");
                mailMessage.setText(ca.getCaName() + "様" + "\nお世話になっております。CONNECT運営事務局でございます。"
                        + "\nユーザーID：" + user_id + "様とマッチングしましたのでお知らせ致します。\n以下ユーザー情報"
                        + "\n\n#################################\n"
                        + "\nユーザーID：" + user_id + "\n名前：" + profile.getName() + "\n読み仮名：" + profile.getYomigana()
                        + "\nメール：" + profile.getMail() + "\n性別：" + profile.getGender() + "\n年齢：" + profile.getAge()
                        + "\n学歴：" + profile.getSchool() + "\n専攻：" + profile.getMajor() + "\n転職回数：" + profile.getTimes()
                        + "\n英語力：" + profile.getEnglish() + "\n転職期間：" + profile.getTermId() + "\n転職タイミング：" + profile.getTimingId()
                        + "\n資格：" + profile.getSkill() + "\n直近の企業名：" + profile.getPCompanyName() + "\n入社年度：" + profile.getJoinedYear()
                        + "\n希望企業名：" + profile.gethCompanyName()
                        + "\n希望業界：" + profile.getBigIndustry() + "\n>" + profile.getMiddleIndustry() + "\n>>" + profile.getSmallIndustry()
                        + "\n希望職種：" + profile.getBigCategory() + "\n>" + profile.getMiddleCategory() + "\n>>" + profile.getSmallCategory()
                        + "\n希望年収：" + profile.getIncome() + "\n希望勤務地：" + profile.getPlaceId() + "\n希望企業規模：" + profile.getScaleNumber()
                        + "\n希望企業タイプ：" + profile.getScaleTypeId() + "\n転職に求めるもの：" + profile.getWorkId()
                        + "\n#################################\n\n"
                        + "\nお問い合わせは下記までお願い致します。" + "\nCONNECT事務局\ntel：03-6432-0874\nmail：agent-info@career-connect.jp\n担当者：山下・秋元"
                );

                javaMailSender.send(mailMessage);
            }
        }
    }

    // ca詳細
    @RequestMapping(value = "/{user_id}/ca/{ca_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_detail(@PathVariable String user_id, @PathVariable String ca_id) throws Exception {

        Chat chat = new Chat();
        chat.setCaId(ca_id);
        chat.setUserId(user_id);
        List caList = new ArrayList<>();
        Ca ca_person = caRepository.selectDetail(chat);

        // caの写真をbase64で変換
        if (ca_person.getCaImg() != null) {
            BufferedInputStream bis = null;
            try {
                final URL url =
                        new URL("http://careerup-camp.jp.s3.amazonaws.com/CA_img/" + ca_person.getCaImg());
                String type = null;
                if (ca_person.getCaImg().matches(".*png.*")) {
                    type = "png";
                } else if (ca_person.getCaImg().matches(".*jpg.*")) {
                    type = "jpg";
                } else if (ca_person.getCaImg().matches(".*gif.*")) {
                    type = "gif";
                }

                bis = new BufferedInputStream(url.openStream());

                final String base64 =
                        new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
                ca_person.setCaImg("data:image/" + type + ";base64," + base64);
            } finally {
                bis.close();
            }
        }

        Place place = placeRepository.selectCaPlace(ca_person);
        Gender gender = genderRepository.selectCaGender(ca_person);

        List<CaResultIndustry> caResultIndustry = caresultindustryRepository.selectCaListAll(ca_person);
        List caResultCompany = caresultcompanyRepository.selectCaListAll(ca_person);
        List<CaResultJobCategory> caResultJobCategory = caresultjobcategoryRepository.selectCaListAll(ca_person);

        caList.add(ca_person);
        caList.add(caResultCompany);
        caList.add(caResultIndustry);
        caList.add(gender);
        caList.add(place);
        caList.add(caResultJobCategory);

        return caList;

    }

    // チャット一覧
    @RequestMapping(value = "/{user_id}/chat", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List chat_list(@PathVariable String user_id) throws Exception {
        Chat chat = new Chat();
        chat.setUserId(user_id);
        List<Chat> chatLists = chatRepository.selectCaList(chat);
        List messageLists = new ArrayList();
        for (Chat _chat : chatLists) {
            Message message = messageRepository.selectLast(_chat);
            // caの写真をbase64で変換
            if (message != null && message.getCaImg() != null) {
                BufferedInputStream bis = null;
                try {
                    final URL url =
                            new URL("http://careerup-camp.jp.s3.amazonaws.com/CA_img/" + message.getCaImg());
                    String type = null;
                    if (message.getCaImg().matches(".*png.*")) {
                        type = "png";
                    } else if (message.getCaImg().matches(".*jpg.*")) {
                        type = "jpg";
                    } else if (message.getCaImg().matches(".*gif.*")) {
                        type = "gif";
                    }

                    bis = new BufferedInputStream(url.openStream());

                    final String base64 =
                            new String(Base64.encodeBase64(IOUtils.toByteArray(bis)));
                    message.setCaImg("data:image/" + type + ";base64," + base64);
                } finally {
                    if (bis != null) {
                        bis.close();
                    }
                }
                messageLists.add(message);
            }
        }
        return messageLists;
    }

    // お知らせ一覧
    @RequestMapping(value = "/{user_id}/notice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List notice_list(@PathVariable String user_id) throws Exception {
        // noticeDBに接続して値を取得
        List noticeLists = noticeRepository.selectAll();
        return noticeLists;
    }

    // お知らせ詳細
    @RequestMapping(value = "/{user_id}/notice/{notice_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List notice_detail(@PathVariable String user_id, @PathVariable String notice_id) throws Exception {
        // noticeDBに接続して値を取得
        Notice notice = new Notice();
        notice.setNoticeId(notice_id);
        List noticeDetail = noticeRepository.selectDetail(notice);
        return noticeDetail;
    }

    // Q&A画面
    @RequestMapping(value = "/{user_id}/Q&A", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List q_a() throws Exception {
        // Q&ADBに接続して値を取得
        List qaLists = qaRepository.selectAll();
        return qaLists;
    }

    // 退会画面
    @RequestMapping(value = "/{user_id}/leave", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void leave(@PathVariable String user_id) throws Exception {
        // ユーザの退会
        User user = new User();
        user.setUserId(user_id);
        userRepository.updateLeave(user);
    }

}
