package com.khoubyari.example.api.rest;

import com.khoubyari.example.dao.entity.*;
import com.khoubyari.example.repository.*;
import io.swagger.annotations.Api;
import com.khoubyari.example.service.CampService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ResourceLoader;

import java.io.*;
import java.util.List;
import java.util.*;

// コントローラークラスだよっていうおまじない
@RestController
@RequestMapping(value = "/v1/api/camp")
@Api(tags = {"camp"})
public class CampController extends AbstractRestHandler {

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private CampService campService;

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
    private final JavaMailSender javaMailSender;

    @Autowired
    CampController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    // welcome画面
    @RequestMapping(value = "/welcome" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List welcome()throws Exception{
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
        return welcome;
    }

    // 個人情報規約画面
    @RequestMapping(value = "/personal" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List personal()throws Exception{
        List personalLists = personalInfoRepository.selectAll();

        return personalLists;
    }
    // 利用規約画面
    @RequestMapping(value="/tos",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List tos() throws Exception{
        // TosDBに接続して値を取得
        List tos = tosRepository.selectAll();
        return tos;
    }

    // ログイン画面 TODO
    @RequestMapping(value = "/login", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(@RequestBody User login){
        // ToDo:正しいものか確認するところ実装
        System.err.println(login);
        System.err.println(login.getAge());
        return login.toString();
    }

    // 必要か分からないけど作成。 CAが承認した場合のflg書き換え chatテーブルのflgを2に
    @RequestMapping(value = "/{ca_id}/{user_id}/permission", method = {RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void permission(@PathVariable String ca_id,@PathVariable String user_id) throws Exception{
        //承認したときのflgを2に変える
        Chat chat = new Chat();
        chat.setCaId(ca_id);
        chat.setUserId(user_id);

        chatRepository.updatePermission(chat);

    }
    // 必要か分からないけど作成・ CAが拒否した場合のflg書き換え chatテーブルのflgを0に
    @RequestMapping(value = "/{ca_id}/{user_id}/denial", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void denial(@PathVariable String ca_id,@PathVariable String user_id) throws Exception{
        //拒否したときのflgを0に変える
        Chat chat = new Chat();
        chat.setCaId(ca_id);
        chat.setUserId(user_id);

        chatRepository.updateDenial(chat);

    }

    // 必要か分からないけど作成・ 通知のオンオフを受け取る
    @RequestMapping(value = "/{user_id}/notification", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void notification(@PathVariable String user_id) throws Exception{
        //通知のオンオフを受け取る

    }

//    @RequestMapping(value="/s3/{filename}", method=RequestMethod.GET)
//    public void download(@PathVariable String filename) throws IOException {
//        Resource resource = this.resourceLoader.getResource("s3://careerup-camp.jp/assets/img" + filename);
//        InputStream input = resource.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//        String str = new String();
//        StringBuilder builder = new StringBuilder();
//        while ((str = reader.readLine()) != null) {
//            builder.append(str);
//        };
//
//        File file = new File("s3://careerup-camp.jp/assets");
//        FileWriter writer = new FileWriter(file);
//        writer.write(builder.toString());
//
//        writer.close();
//        reader.close();
//        input.close();
//    }

    public void python(String user_id,int age,String gender,String times,String big_p_ind,String big_p_jc,String big_h_in,String big_h_jc,String scale_number)throws IOException{
        Chat chat = new Chat();
        String[] cmd = {"/Users/sekipon/anaconda3/bin/python3","1121_rf_match.py", String.valueOf(age)
                ,gender,times,big_p_ind,big_p_jc,big_h_in,big_h_jc,scale_number};

        ProcessBuilder pb = new ProcessBuilder(cmd);
        Process proc = pb.start();

        String str;

        //　エラーの場合
        BufferedReader brerr = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        while((str = brerr.readLine()) != null) {
            System.err.println(str);
        }
        brerr.close();

        BufferedReader brstd = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        while((str = brstd.readLine()) != null) {
            // 配列を分解
            String[] fruit = str.split(",", 0);
            System.err.println(str);

            for (String s:fruit) {
                // "["と"]"を除去
                trimSpace(s);
                chat.setUserId(user_id);
                chat.setCaId(s);
                chatRepository.insert(chat);
            }
        }
        brstd.close();

    }

    public String trimSpace(String str){
        str=str.replace("[","");
        str=str.replace("]","");
        str=str.replace(" ","");
        str=str.replace("　","");
        str=str.replace("\uFEFF","");
        str.trim();

        return str;
    }

    // 初期登録画面
    @RequestMapping(value = "/{user_id}/question/basic", method = {RequestMethod.POST}, consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void basic(@PathVariable String user_id, @RequestBody String json)throws IOException
    {
        System.err.println("basicの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Basic basic = mapper.readValue(json, Basic.class);

        Chat chat = new Chat();
        chat.setUserId(user_id);
        chat.setFlg(1);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setIndustryId(basic.getH_industry()+basic.getH_industry_middle()+basic.getH_industry_small());
        userhope.setJobCategoryId(basic.getH_job_category()+basic.getH_job_category_middle()+basic.getH_job_category_small());

        // オプション項目できくけど一旦６にする
        userhope.setScaleNumberId("6");
        userhopeRepository.insertBasicUserHope(userhope);

        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userprevious.setCompanyName(basic.getP_company_name());
        userprevious.setIndustryId(trimSpace(basic.getP_industry()+basic.getP_industry_middle()+basic.getP_industry_small()));
        userprevious.setJobCategoryId(trimSpace(basic.getP_job_category()+basic.getP_job_category_middle()+basic.getP_job_category_small()));
        userprevious.setJoinedYear(basic.getJoined_year());
        userpreviousRepository.insertBasicUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAge(basic.getAge());
        user.setEnglishId(trimSpace(basic.getEnglish()));
        user.setGenderId(trimSpace(basic.getGender().trim()));
        user.setMajorId(trimSpace(basic.getMajor().trim()));
        user.setSchool(trimSpace(basic.getSchool()));
        user.setTimesId(trimSpace(basic.getTimesId().trim()));
        user.setAcademicId("なし");
        userRepository.insertBasicUser(user);

        System.err.println("AIシステム＝"+user_id+","+user.getAge()+","
                +basic.getP_job_category()+","+basic.getH_industry()+","+userhope.getScaleNumberId());
        //AIシステムへ
        python(user_id,user.getAge(),user.getGenderId(),user.getTimesId(),basic.getP_industry()
                ,basic.getP_job_category(),basic.getH_industry(),basic.getH_job_category(),userhope.getScaleNumberId());

    }

     // オプション登録画面
    @RequestMapping(value = "/{user_id}/question/option", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void option(@RequestBody String json,@PathVariable String user_id)throws IOException{
        System.err.println("optionの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Option option = mapper.readValue(json, Option.class);

        Chat chat = new Chat();
        chat.setUserId(user_id);
        chat.setFlg(1);

        System.err.println(option.getP_industry_small());

        UserPrevious userprevious= new UserPrevious();
        userprevious.setUserId(user_id);
        userprevious.setCompanyName(option.getP_company_name());
        userprevious.setIndustryId(trimSpace(option.getP_industry()+option.getP_industry_middle()+option.getP_industry_small()));
        userprevious.setJobCategoryId(trimSpace(option.getP_job_category()+option.getP_job_category_middle()
                +option.getP_job_category_small()));
        userprevious.setJoinedYear(option.getJoined_year());
        userpreviousRepository.insertOptionUserPrevious(userprevious);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setPlaceId(trimSpace(option.getPlace()));
        userhope.setCompanyName(trimSpace(option.getH_company_name()));
        userhope.setIncome(trimSpace(option.getIncome()));
        userhope.setWorkId(trimSpace(option.getWork()));
        userhope.setScaleNumberId(trimSpace(option.getScaleNumber()));
        userhope.setScaleTypeId(trimSpace(option.getScaleType()));
        userhope.setIndustryId(option.getH_industry()+option.getH_industry_middle()+option.getH_industry_small());
        userhope.setJobCategoryId(option.getH_job_category()+option.getH_job_category_middle()+option.getH_job_category_small());
        userhopeRepository.insertOptionUserHope(userhope);


        User user=new User();
        user.setUserId(user_id);
        user.setSkill(option.getSkill());
        user.setTimingId(trimSpace(option.getTiming()));
        user.setTermId(trimSpace(option.getTerm()));
        user.setAge(option.getAge());
        user.setEnglishId(trimSpace(option.getEnglish()));
        user.setGenderId(trimSpace(option.getGender().trim()));
        user.setMajorId(trimSpace(option.getMajor().trim()));
        user.setSchool(trimSpace(option.getSchool()));
        user.setTimesId(trimSpace(option.getTimesId().trim()));
        user.setAcademicId("なし");
        userRepository.insertOptionUser(user);

        //　AIシステムへ
        python(user_id,user.getAge(),user.getGenderId(),user.getTimesId(),option.getP_industry()
                ,option.getP_job_category(),option.getH_industry(),option.getH_job_category(),option.getScaleNumber());

    }

    // マイプロフィール画面 プロフィール一覧をフロントに送信
    @RequestMapping(value="/{user_id}/myprofile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List user_list(@PathVariable String user_id) throws Exception{
        User user = new User();
        user.setUserId(user_id);

        UserHope userhope = new UserHope();
        userhope.setUserId(user_id);
        List userhopeList = new ArrayList();

        UserPrevious userprevious = new UserPrevious();
        userprevious.setUserId(user_id);

        List userList=userRepository.selectUser(user);
        userList.add(userhopeRepository.selectMyprofile(userhope));
        userList.add(userpreviousRepository.selectMyprofile(userprevious));

        return userList;

    }

    // マイプロフィール登録画面　新しく登録し直す
    @RequestMapping(value = "/{user_id}/myprofile", method = {RequestMethod.POST}, consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void myprofile(@RequestBody String json, @PathVariable String user_id)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Myprofile myprofile = mapper.readValue(json, Myprofile.class);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setIndustryId(trimSpace(myprofile.getH_bigIndustry()+myprofile.getH_middleIndustry()+myprofile.getH_smallIndustry()));
        userhope.setPlaceId(trimSpace(myprofile.getPlace()));
        userhope.setCompanyName(myprofile.getH_company());
        userhope.setIncome(trimSpace(myprofile.getIncome()));
        userhope.setWorkId(trimSpace(myprofile.getWork()));
        userhope.setScaleTypeId(trimSpace(myprofile.getScaleType()));
        userhope.setScaleNumberId(trimSpace(myprofile.getScaleNumber()));
        userhope.setJobCategoryId(trimSpace(myprofile.getH_bigCategory()+myprofile.getH_middleCategory()+myprofile.getH_smallCategory()));
        userhopeRepository.updateMyprofileUserHope(userhope);

        //会社の数だけ繰り返すfor文
        //previous_idだけはAutoIncrementで生成しているので、更新時は前のものは全てDeleteし、新しくinsertする
        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userpreviousRepository.delete(userprevious);

        userprevious.setIndustryId(trimSpace(myprofile.getBigIndustry()+myprofile.getMiddleIndustry()+myprofile.getSmallIndustry()));
        userprevious.setCompanyName(myprofile.getP_company());
        userprevious.setJobCategoryId(trimSpace(myprofile.getBigCategory()+myprofile.getMiddleCategory()+myprofile.getSmallCategory()));
        userprevious.setJoinedYear(myprofile.getJoined_year());
        userpreviousRepository.insertOptionUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAcademicId("なし");
        user.setAge(myprofile.getAge());
        user.setEnglishId(trimSpace(myprofile.getEnglish()));
        user.setGenderId(trimSpace(myprofile.getGender()));
        user.setMajorId(trimSpace(myprofile.getMajor()));
        user.setSchool(myprofile.getSchool());
        user.setTimingId(trimSpace(myprofile.getTiming()));
        user.setTermId(trimSpace(myprofile.getTerm()));
        user.setTimesId(myprofile.getTimes());
        user.setSkill(myprofile.getSkill());
        user.setLastName(myprofile.getLastName());
        user.setFirstName(myprofile.getFirstName());
        userRepository.updateMyprofileUser(user);

        python(user_id,user.getAge(),user.getGenderId(),user.getTimesId(),myprofile.getBigIndustry()
                ,myprofile.getBigCategory(),myprofile.getBigIndustry(),myprofile.getH_bigCategory(),myprofile.getScaleNumber());

    }

    // アカウント画面
    @RequestMapping(value = "/{user_id}/account", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User account(@PathVariable String user_id)throws IOException{
        User user=new User();
        user.setUserId(user_id);
        return userRepository.selectAccount(user);
    }

    // アカウント画面
    @RequestMapping(value = "/{user_id}/account", method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void account(@RequestBody String json, @PathVariable String user_id)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        User account = mapper.readValue(json, User.class);

        account.setUserId(user_id);
        account.setPassword(account.getPassword());
        account.setCellphone(account.getCellphone());
        userRepository.updateAccount(account);

    }

    // お問い合わせメール
    @RequestMapping(value = "/{user_id}/contact", method = RequestMethod.POST
           // , consumes = MediaType.APPLICATION_JSON_VALUE
            )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String contact(@RequestBody String json, @PathVariable String user_id)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        System.err.println("jsonの中身＝"+json);
        Contact contact = mapper.readValue(json, Contact.class);

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo("mayu.0110.cola@gmail.com");//Todo campのメアド入れる
        //mailMessage.setReplyTo("リプライのメールアドレス");
        mailMessage.setFrom("m.sekine@mybrainlab.net");//Todo campのメアド入れる
        mailMessage.setSubject(user_id+"様からのお問い合わせ");
        mailMessage.setText("ユーザID："+user_id+"様からのお問い合わせを頂きました。\n以下本文" +
                "\n#################################\n\n"+contact.getContactMessage());

        javaMailSender.send(mailMessage);

        return "お問い合わせが完了しました。事務局からの返信をお待ちくださいませ。";
    }

//    // お問い合わせ画面
//    @RequestMapping(value = "/{user_id}/contact", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public void contact(@RequestBody String json,@PathVariable String user_id)throws IOException{
//        // IDはクエリから取得
//        System.err.println("jsonの中身＝"+json);
//        ObjectMapper mapper = new ObjectMapper();
//        Contact contact = mapper.readValue(json, Contact.class);
//        contact.setRequesterId(user_id);
//        contact.setContactMessage(contact.getContactMessage());
//        contactRepository.insert(contact);
//    }

    // campへのご要望画面
    @RequestMapping(value = "/{user_id}/camp_request", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void camp_request(@RequestBody String json, @PathVariable String user_id)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Request request = mapper.readValue(json, Request.class);
        request.setRequesterId(user_id);
        request.setRequestMessage(request.getRequestMessage());
        requestRepository.insert(request);
    }

    // ユーザからの評価画面
    @RequestMapping(value = "/{user_id}/review", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void review(@RequestBody String json, @PathVariable String user_id)throws IOException{
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
    @RequestMapping(value="/{user_id}/ca",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_list(@PathVariable String user_id,
                         HttpServletRequest request, HttpServletResponse response) throws Exception {
        Chat chat=new Chat();
        chat.setUserId(user_id);
        List caList=caRepository.selectCaLists(chat);

        return caList;
    }

    // ca詳細
    @RequestMapping(value = "/{user_id}/ca/{ca_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_detail(@PathVariable String user_id,@PathVariable String ca_id) throws Exception{

        Ca ca = new Ca();
        ca.setCaId(ca_id);
        List caList=new ArrayList<>();
        Ca ca_person = caRepository.selectDetail(ca);
        Place place = placeRepository.selectCaPlace(ca_person);
        Gender gender =genderRepository.selectCaGender(ca_person);

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
    public List chat_list(@PathVariable String user_id) throws Exception{
        Chat chat = new Chat();
        chat.setUserId(user_id);
        List<Chat> chatLists = chatRepository.selectCaList(chat);
        List messageLists=new ArrayList();
        for(Chat _chat:chatLists) {
            Message message=messageRepository.selectLast(_chat);
            messageLists.add(message);
        }
        return messageLists;
    }

    // チャット詳細 TODO
    @RequestMapping(value = "/{user_id}/chat/{chat_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List chat_detail(@PathVariable String user_id, @PathVariable int chat_id) throws Exception{
        Message message = new Message();
        message.setChatId(chat_id);
        List messageLists = messageRepository.selectDetail(message);
        return messageLists;
    }

    // お知らせ一覧
    @RequestMapping(value="/{user_id}/notice",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List notice_list(@PathVariable String user_id) throws Exception{
        // noticeDBに接続して値を取得
        List noticeLists = noticeRepository.selectAll();
        return noticeLists;
    }

    // お知らせ詳細
    @RequestMapping(value="/{user_id}/notice/{notice_id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List notice_detail(@PathVariable String user_id,@PathVariable String notice_id) throws Exception{
        // noticeDBに接続して値を取得
        Notice notice = new Notice();
        notice.setNoticeId(notice_id);
        List noticeDetail = noticeRepository.selectDetail(notice);
        return noticeDetail;
    }

    // Q&A画面
    @RequestMapping(value="/{user_id}/Q&A",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List q_a() throws Exception{
        // Q&ADBに接続して値を取得
        List qaLists = qaRepository.selectAll();
        return qaLists;
    }

}