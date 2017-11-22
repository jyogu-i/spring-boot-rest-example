package com.khoubyari.example.api.rest;

import com.khoubyari.example.dao.entity.*;
import com.khoubyari.example.repository.*;
import io.swagger.annotations.Api;
import com.khoubyari.example.service.CampService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;
import java.util.List;


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
    private ContactRepository contactRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private UserReviewRepository userreviewRepository;

    @Autowired
    private TosRepository tosRepository;

    @Autowired
    private PersonalInfoRepository personalInfoRepository;


    // welcome画面
    @RequestMapping(value = "/welcome" , method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List welcome()throws Exception{
        // ToDo:プルダウン要素全て返す
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

    // ログイン画面 TODO
    @RequestMapping(value = "/login", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public String login(@RequestBody User login){
        // ToDo:正しいものか確認するところ実装
        System.err.println(login);
        System.err.println(login.getAge());
        return login.toString();
    }

    // ログイン画面 TODO
    @RequestMapping(value = "/test", method = {RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public Basic a()throws IOException{
        String json="{\"gender\":\"女性\",\"age\":\"23\",\"academic\":\"\",\"school\":\"o\",\"major\":\"10\",\"p_company_name\":\"p\",\"joined_year\":\"2017\",\"p_job_category\":\"4\"}\n";
        ObjectMapper mapper = new ObjectMapper();
        Basic hoge = mapper.readValue(json, Basic.class);
        System.err.println(hoge.getAge());
        System.err.println(hoge.getSchool());
        return hoge;
    }

    // 初期登録画面
    @RequestMapping(value = "/{user_id}/question/basic", method = {RequestMethod.POST}, consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String basic(@PathVariable String user_id, @RequestBody String json)throws IOException
    {
        System.err.println("basicの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Basic basic = mapper.readValue(json, Basic.class);

        Chat chat = new Chat();
        chat.setUserId(user_id);
        chat.setFlg(1);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        // ToDo
        userhope.setIndustryId(basic.getHIndustry());
        userhope.setJobCategoryId("あとで");

        // オプション項目できくけど一旦６にする
        userhope.setScaleNumberId("6");
        //userhopeRepository.insertBasicUserHope(userhope);

        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userprevious.setCompanyName(basic.getPCompanyName());
        userprevious.setIndustryId(basic.getPIndustry());
        // ToDo
        userprevious.setJobCategoryId("あとで");
        userprevious.setJoinedYear(basic.getJoinedYear());
       // userpreviousRepository.insertOptionUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAcademicId(basic.getAcademic());
        user.setAge(basic.getAge());
        user.setEnglishId(basic.getEnglish());
        user.setGenderId(basic.getGender());
        user.setMajorId(basic.getMajor());
        user.setSchool(basic.getSchool());
        user.setTimingId(basic.getTimingId());
        user.setTermId(basic.getTermId());
        user.setTimesId(basic.getTimesId());
        //userRepository.insertOptionUser(user);

        String hope_jc=userhope.getJobCategoryId().substring(0);
        System.err.println("iiiii"+basic.getHIndustry());
        String hope_in=userhope.getIndustryId().substring(0);

        String pre_jc=userprevious.getJobCategoryId().substring(0);
        String pre_in=userprevious.getIndustryId().substring(0);

        //AIシステムへ
        String[] cmd = {"/Users/sekipon/anaconda3/bin/python3","1121_rf_match.py", String.valueOf(user.getAge())
                ,user.getGenderId(),user.getTimesId(),pre_in,pre_jc,hope_in,hope_jc,userhope.getScaleNumberId()};

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
                s=s.replace("[","");
                s=s.replace("]","");
                s=s.replace(" ","");
                s.trim();
                chat.setCaId(s);
                chatRepository.insert(chat);
            }
        }
        brstd.close();
        System.err.println("キタコレ");
        return "完了";
    }

     // オプション登録画面
    @RequestMapping(value = "/{user_id}/question/option", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void option(@RequestBody String json,@PathVariable String user_id)throws IOException{
        System.err.println("optionの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Option option = mapper.readValue(json, Option.class);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setPlaceId(option.getPlaceId());
        userhope.setCompanyName(option.getCompanyName());
        userhope.setIncome(option.getIncome());
        userhope.setWorkId(option.getWorkId());
        userhope.setScaleNumberId(option.getScaleNumberId());
        userhope.setScaleTypeId(option.getScaleTypeId());
        userhopeRepository.updateOptionUserHope(userhope);

        User user=new User();
        user.setUserId(user_id);
        // ToDo スキル複数どうする
        user.setSkill(option.getSkill());
        userRepository.updateOptionUser(user);

        System.out.println(user);
        //ToDo Python処理
    }

    // マイプロフィール画面 プロフィール一覧をフロントに送信
    @RequestMapping(value="/{user_id}/myprofile", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List user_list(@PathVariable String user_id) throws Exception{
        User user = new User();
        UserPrevious userprevious = new UserPrevious();
        UserHope userhope = new UserHope();
        user.setUserId(user_id);
        userhope.setUserId(user_id);
        userprevious.setUserId(user_id);
        List userLists = userRepository.selectUser(user);
        userLists.add(userhopeRepository.selectUserHope(userhope));
        userLists.add(userpreviousRepository.selectUserPrevious(userprevious));

        return userLists;
    }

    // プロフィール登録画面　新しく登録し直す
    @RequestMapping(value = "/{user_id}/myprofile", method = {RequestMethod.POST}, consumes ={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void myprofile(@RequestBody String json, @PathVariable String user_id)throws IOException{
        System.err.println("myprofileの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Myprofile myprofile = mapper.readValue(json, Myprofile.class);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        // ToDo
        userhope.setIndustryId("100");

        userhope.setPlaceId(myprofile.getPlaceId());
        userhope.setCompanyName(myprofile.getCompanyName());
        userhope.setIncome(myprofile.getIncome());
        userhope.setWorkId(myprofile.getWorkId());
        userhope.setScaleTypeId(myprofile.getScaleTypeId());
        userhope.setScaleNumberId(myprofile.getScaleNumberId());

        //Todo
        userhope.setJobCategoryId("1690");
        userhopeRepository.updateMyprofileUserHope(userhope);

        //会社の数だけ繰り返すfor文
        //previous_idはAutoIncrementで生成しているので、更新時は前のものは全てDeleteし、新しくinsertする
        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userpreviousRepository.delete(userprevious);
        userprevious.setCompanyName(myprofile.getCompanyName());
        //Todo
        userprevious.setJobCategoryId("0999");
        userprevious.setJoinedYear(myprofile.getJoinedYear());
        userpreviousRepository.updateMyprofileUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAcademicId(myprofile.getAcademicId());
        user.setAge(myprofile.getAge());
        user.setEnglishId(myprofile.getEnglishId());
        user.setGenderId(myprofile.getGenderId());
        user.setMajorId(myprofile.getMajorId());
        user.setSchool(myprofile.getSchool());
        user.setTimingId(myprofile.getTimingId());
        user.setTermId(myprofile.getTermId());
        user.setTimesId(myprofile.getTimesId());
        // ToDO
        user.setSkill(myprofile.getSkill());
        userRepository.updateMyprofileUser(user);

        System.out.println(user);
    }

    // お問い合わせ画面
    @RequestMapping(value = "/{user_id}/contact", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void contact(@RequestBody String json,@PathVariable String user_id)throws IOException{
        // IDはクエリから取得
        System.err.println("jsonの中身＝"+json);
        ObjectMapper mapper = new ObjectMapper();
        Contact contact = mapper.readValue(json, Contact.class);
        contact.setRequesterId(user_id);
        contact.setContactMessage(contact.getContactMessage());
        contactRepository.insert(contact);
    }

    // campへのご要望画面
    @RequestMapping(value = "/{user_id}/camp_request", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void camp_request(@RequestBody String json, @PathVariable String user_id)throws IOException{
        System.err.println("jsonの中身＝"+json);
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
        System.err.println("jsonの中身＝"+json);
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
    @RequestMapping(value="/{user_id}/ca",method=RequestMethod.GET,produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_list(@PathVariable String user_id,
                         HttpServletRequest request, HttpServletResponse response) throws Exception {
        Chat chat = new Chat();
        chat.setUserId(user_id);
        List chatLists = chatRepository.selectCaList(chat);
        return chatLists;
    }

    // ca詳細
    @RequestMapping(value = "/{user_id}/ca/{ca_id}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List ca_detail(@PathVariable String user_id,@PathVariable String ca_id) throws Exception{
        Ca ca = new Ca();
        ca.setCaId(ca_id);
        CaResultJobCategory caresultjobcategory = new CaResultJobCategory();
        caresultjobcategory.setCaId(ca_id);
        CaResultIndustry caresultindustry = new CaResultIndustry();
        caresultindustry.setCaId(ca_id);
        CaResultCompany caresultcompany = new CaResultCompany();
        caresultcompany.setCaId(ca_id);
        List caDetail = caRepository.selectDetail(ca);
        caDetail.add(caresultjobcategoryRepository.selectDetail(caresultjobcategory));
        caDetail.add(caresultindustryRepository.selectDetail(caresultindustry));
        caDetail.add(caresultcompanyRepository.selectDetail(caresultcompany));
        return caDetail;
  }

    // チャット一覧 Todo チャットが始まってるのだけ返す?
    @RequestMapping(value = "/{user_id}/chat", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List chat_list(@PathVariable String user_id) throws Exception{
        Chat chat = new Chat();
        chat.setUserId(user_id);
        List chatLists = chatRepository.selectCaList(chat);
        return chatLists;
    }

    // チャット詳細
    @RequestMapping(value = "/{user_id}/chat/{chat_id}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List chat_detail(@PathVariable String user_id, @PathVariable int chat_id) throws Exception{
        Message message = new Message();
        message.setChatId(chat_id);
        List messageLists = messageRepository.selectDetail(message);
        return messageLists;
    }


    // お知らせ一覧
    @RequestMapping(value="/{user_id}/notice",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List notice_list(@PathVariable String user_id) throws Exception{
        // noticeDBに接続して値を取得
        List noticeLists = noticeRepository.selectAll();
        return noticeLists;
    }

    // お知らせ詳細
    @RequestMapping(value="/{user_id}/notice/{notice_id}",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List notice_detail(@PathVariable String user_id,@PathVariable String notice_id) throws Exception{
        // noticeDBに接続して値を取得
        Notice notice = new Notice();
        notice.setNoticeId(notice_id);
        List noticeDetail = noticeRepository.selectDetail(notice);
        return noticeDetail;
    }

    // Q&A画面
    @RequestMapping(value="/{user_id}/Q&A",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List q_a() throws Exception{
        // Q&ADBに接続して値を取得
        List qaLists = qaRepository.selectAll();
        return qaLists;
    }

    // 利用規約画面
    @RequestMapping(value="/{user_id}/tos",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List tos(@PathVariable String user_id) throws Exception{
        // TosDBに接続して値を取得
        List tos = tosRepository.selectAll();
        return tos;
    }

    // 個人情報規約画面
    @RequestMapping(value="/{user_id}/personal_info",method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public List pi(@PathVariable String user_id) throws Exception{
        // TosDBに接続して値を取得
        List pi = personalInfoRepository.selectAll();
        return pi;
    }

}