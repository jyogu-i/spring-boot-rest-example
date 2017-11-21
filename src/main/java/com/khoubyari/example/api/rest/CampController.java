package com.khoubyari.example.api.rest;

import com.khoubyari.example.dao.entity.*;
import com.khoubyari.example.repository.*;
import io.swagger.annotations.Api;
import com.khoubyari.example.service.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.util.List;


// コントローラークラスだよっていうおまじない
@RestController
@RequestMapping(value = "/v1/api/camp")
@Api(tags = {"camp"})
public class CampController extends AbstractRestHandler {
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

    // 初期登録画面 TODO
    @RequestMapping(value = "/{user_id}/question/basic", method = {RequestMethod.POST}
    , consumes =MediaType.ALL_VALUE
            )
    @ResponseBody
    public void basic(@PathVariable String user_id, @RequestBody String basic
    )throws IOException, ServletException{
        System.out.println("basicの中身＝"+basic);
        System.out.println(basic.toString());
        Chat chat = new Chat();
        chat.setUserId(user_id);
        chat.setFlg(1);

        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setIndustryId("100");
        userhope.setJobCategoryId("1690");
        userhope.setScaleNumberId("6");
        //userhopeRepository.insertBasicUserHope(userhope);

        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userprevious.setCompanyName("kocchi");
        userprevious.setIndustryId("A230");
        userprevious.setJobCategoryId("0999");
        userprevious.setJoinedYear(1900);
       // userpreviousRepository.insertOptionUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAcademicId("0");
        user.setAge(24);
        user.setEnglishId("2");
        user.setGenderId("1");
        user.setMajorId("1");
        user.setSchool("hogeUniv");
        user.setTimingId("1");
        user.setTermId("2");
        user.setTimesId("4");
        //userRepository.insertOptionUser(user);

        String hope_jc=userhope.getJobCategoryId().substring(0);
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
                //System.out.println(s);
                chat.setCaId(s);
                chatRepository.insert(chat);
//                List a = chatRepository.selectApproval(chat);
//                System.out.println("aの値は"+a);
            }
        }
        brstd.close();
    }

     // オプション登録画面 TODO
    @RequestMapping(value = "/{user_id}/question/option", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void option(@RequestBody User option,@PathVariable String user_id){
        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setPlaceId("100");
        userhope.setCompanyName("株式会社テスト");
        userhope.setIncome(1);
        userhope.setWorkId("3");
        userhope.setScaleNumberId("3");
        userhope.setScaleTypeId("2");
        userhopeRepository.insertOptionUserHope(userhope);

        User user=new User();
        user.setUserId(user_id);
        user.setSkill("0");
        userRepository.insertBasicUser(user);

        System.out.println(user);
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

    // プロフィール登録画面　新しく登録し直す TODO
    @RequestMapping(value = "/{user_id}/myprofile"
          //  , method = {RequestMethod.POST}, consumes ={"application/json"}
            )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void myprofile(
           // @RequestBody User myprofile,
           @PathVariable String user_id
    ){
        UserHope userhope=new UserHope();
        userhope.setUserId(user_id);
        userhope.setIndustryId("100");
        userhope.setPlaceId("100");
        userhope.setCompanyName("株式会社テスト");
        userhope.setIncome(1);
        userhope.setWorkId("3");
        userhope.setScaleTypeId("3");
        userhope.setScaleNumberId("1");
        userhope.setJobCategoryId("1690");
        userhopeRepository.updateMyprofileUserHope(userhope);

        //ToDo previous_idをもらってそれを元にUPDATEしないといけない
        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userprevious.setCompanyName("kocchi");
        userprevious.setJobCategoryId("0999");
        userprevious.setJoinedYear(1900);
        userpreviousRepository.updateMyprofileUserPrevious(userprevious);

        User user=new User();
        user.setUserId(user_id);
        user.setAcademicId("0");
        user.setAge(24);
        user.setEnglishId("2");
        user.setGenderId("1");
        user.setMajorId("1");
        user.setSchool("hogeUniv");
        user.setTimingId("1");
        user.setTermId("2");
        user.setTimesId("4");
        user.setSkill("0");
        userRepository.updateMyprofileUser(user);

        System.out.println(user);
    }

    // お問い合わせ画面 TODO
    @RequestMapping(value = "/{user_id}/contact", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void contact(@RequestBody Contact contact,@PathVariable String user_id){
        // IDはクエリから取得
        Contact contactList=new Contact();
        contact.setRequesterId(user_id);
        contact.setContactMessage("");
        contactRepository.insert(contact);
    }

    // campへのご要望画面 TODO
    @RequestMapping(value = "/{user_id}/camp_request", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void camp_request(@RequestBody Request camp_request, @PathVariable String user_id){
        Request request = new Request();
        request.setRequesterId(user_id);
        request.setRequestMessage("");
        requestRepository.insert(request);
    }

    // ユーザからの評価画面 Todo
    @RequestMapping(value = "/{user_id}/review", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void review(@RequestBody UserReview review, @PathVariable String user_id){
        UserReview userreview = new UserReview();
        userreview.setUserId(user_id);
        userreview.setCaId("");
        userreview.setInterview(3);
        userreview.setReviewCompany(3);
        userreview.setSelection(3);
        userreview.setSynthesis(3);
        userreview.setReviewMessage("");
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
        List chatLists = chatRepository.selectDetail(chat);
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
        List chatLists = chatRepository.selectDetail(chat);
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
        System.err.println(notice_id);
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


   /* @RequestMapping(value = "ここにURL入れる？",
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    // httpステータスコードを返す。ここは201
    @ResponseStatus(HttpStatus.CREATED)

    // APIの操作や、パスなどの情報を設定
    @ApiOperation(value = "Create a hotel resource.", notes = "Returns the URL of the new resource in the Location header.")
    public void createHotel(@RequestBody Hotel hotel,
                                 HttpServletRequest request, HttpServletResponse response) {
        Hotel createdHotel = this.campService.createHotel(hotel);
        response.setHeader("Location", request.getRequestURL().append("/").append(createdHotel.getId()).toString());
    }*/

    /*@RequestMapping(value = "URL？",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get a paginated list of all hotels.", notes = "The list is paginated. You can provide a page number (default 0) and a page size (default 100)")
    public
    @ResponseBody
    // APIの値に関する情報を設定
    Page<User> getAllHotel(@ApiParam(value = "The page number (zero-based)", required = true)
                                      @RequestParam(value = "page", required = true, defaultValue = DEFAULT_PAGE_NUM) Integer page,
                                      @ApiParam(value = "Tha page size", required = true)
                                      @RequestParam(value = "size", required = true, defaultValue = DEFAULT_PAGE_SIZE) Integer size,
                                      HttpServletRequest request, HttpServletResponse response) {
        return this.campService.getAllHotels(page, size);
    }*/

    // URLとの紐付けしている？
//    @RequestMapping(value = "前にURL？/{id}",
//            method = RequestMethod.POST,
//            produces = {"application/json", "application/xml"})
//    @ResponseStatus(HttpStatus.OK)
//    // APIの操作や、パスなどの情報を設定/該当するIDを渡す
//    @ApiOperation(value = "Get a single hotel.", notes = "You have to provide a valid hotel ID.")
//    public
//    @ResponseBody
//        // APIの値に関する情報を設定
//        // @RequestMappingと対応するパラメータを@PathVariableの引数に渡す
//    User getHotel(@ApiParam(value = "The ID of the hotel.", required = true)
//                             @PathVariable("id") String user_id,
//                             HttpServletRequest request, HttpServletResponse response) throws Exception {
//        User hotel = this.campService.getUser(user_id);
//        checkResourceFound(hotel);
//        //todo: http://goo.gl/6iNAkz
//        return hotel;
//    }

    /*@RequestMapping(value = "/{id}",
            method = RequestMethod.PUT,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    // APIの操作や、パスなどの情報を設定/該当するIDを渡す
    @ApiOperation(value = "Update a hotel resource.", notes = "You have to provide a valid hotel ID in the URL and in the payload. The ID attribute can not be updated.")
    // @RequestMappingと対応するパラメータを@PathVariableの引数に渡す
    public void updateHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
                                 @PathVariable("id") Long id, @RequestBody Hotel hotel,
                                 HttpServletRequest request, HttpServletResponse response) {
        checkResourceFound(this.campService.getHotel(id));
        if (id != hotel.getId()) throw new DataFormatException("ID doesn't match!");
        this.campService.updateHotel(hotel);
    }*/

    //todo: @ApiImplicitParams, @ApiResponses
//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.DELETE,
//            produces = {"application/json", "application/xml"})
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ApiOperation(value = "Delete a hotel resource.", notes = "You have to provide a valid hotel ID in the URL. Once deleted the resource can not be recovered.")
//    public void deleteHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
//                                 @PathVariable("id") String user_id, HttpServletRequest request,
//                                 HttpServletResponse response) {
//        checkResourceFound(this.campService.getUser(user_id));
//        this.campService.deleteUser(user_id);
//    }
}