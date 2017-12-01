package com.khoubyari.example.api.rest;

import com.khoubyari.example.dao.entity.*;
import com.khoubyari.example.dao.model.*;
import com.khoubyari.example.repository.*;
import io.swagger.annotations.Api;
import com.khoubyari.example.service.CampService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
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
import java.util.HashMap;
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

    // personal画面
    @RequestMapping(value = "/personal" , method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List personal()throws Exception{
        // ToDo:プルダウン要素全て返す
        List personalLists = personalInfoRepository.selectAll();

        return personalLists;
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

    // test画面 TODO
    @RequestMapping(value = "/{ca_id}/test", method = {RequestMethod.GET}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List a(@PathVariable String ca_id) throws Exception{
        Ca ca = new Ca();
        ca.setCaId(ca_id);
        List caList=new ArrayList<>();
        Ca ca_person = caRepository.selectDetail(ca);
        Place place = placeRepository.selectCaPlace(ca_person);
        System.err.println("aaaa"+place.getPlace());

        List<CaResultIndustry> caResultIndustry = caresultindustryRepository.selectCaListAll(ca_person);
        List caResultCompany = caresultcompanyRepository.selectCaListAll(ca_person);
        List<CaResultJobCategory> caResultJobCategory = caresultjobcategoryRepository.selectCaListAll(ca_person);

        List jobLists=new ArrayList<>();
        for (CaResultJobCategory _crj:caResultJobCategory) {
            JobCategory job = jobcategoryRepository.selectCaJobCategory(_crj);
            jobLists.add(job);
        }

        List indLists=new ArrayList<>();
        for (CaResultIndustry _cri:caResultIndustry) {
            Industry ind = industryRepository.selectCaIndustry(_cri);
            indLists.add(ind);
        }

        caList.add(ca_person);
        caList.add(place);
        caList.add(caResultCompany);
        caList.add(caResultIndustry);
        caList.add(indLists);
        caList.add(caResultJobCategory);
        caList.add(jobLists);

        return caList;
    }
    @RequestMapping(value="/s3/{filename}", method=RequestMethod.GET)
    public void download(@PathVariable String filename) throws IOException {
        Resource resource = this.resourceLoader.getResource("s3://careerup-camp.jp/assets/img" + filename);
        InputStream input = resource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String str = new String();
        StringBuilder builder = new StringBuilder();
        while ((str = reader.readLine()) != null) {
            builder.append(str);
        };

        File file = new File("s3://careerup-camp.jp/assets");
        FileWriter writer = new FileWriter(file);
        writer.write(builder.toString());

        writer.close();
        reader.close();
        input.close();
    }

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
                System.out.println("マッチングしたCA"+s);
                chatRepository.insert(chat);
            }
        }
        brstd.close();

    }

    public String trimSpace(String str){
        str=str.replace("\uFEFF[","");
        str=str.replace("[\uFEFF","");
        str=str.replace("]\uFEFF","");
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
        userprevious.setIndustryId(trimSpace(basic.getP_industry()));
        userprevious.setJobCategoryId(trimSpace(basic.getP_job_category()+basic.getP_job_category_middle()+basic.getP_job_category_small()));
        userprevious.setJoinedYear(basic.getJoined_year());
        userpreviousRepository.insertBasicUserPrevious(userprevious);
        System.err.println("basic.getP_job_category_middle"+basic.getP_job_category_middle());


        User user=new User();
        user.setUserId(user_id);
        user.setAge(basic.getAge());
        user.setEnglishId(trimSpace(basic.getEnglish()));
        user.setGenderId(trimSpace(basic.getGender().trim()));
        user.setMajorId(trimSpace(basic.getMajor().trim()));
        user.setSchool(trimSpace(basic.getSchool()));
        user.setTimesId(trimSpace(basic.getTimesId().trim()));
        userRepository.insertBasicUser(user);


        //AIシステムへ
//        python(user_id,user.getAge(),user.getGenderId(),user.getTimesId(),basic.getP_industry()
//                ,basic.getP_job_category(),basic.getH_industry(),basic.getH_job_category(),userhope.getScaleNumberId());
        chat.setFlg(2);
        chat.setCaId("C04");
        chatRepository.insert(chat);
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


//        chat.setFlg(2);
//        chat.setCaId("C04");
//        chatRepository.insert(chat);
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

        List<User> userLists = userRepository.selectUser(user);
        List userModelLists = new ArrayList<>();

        for(User _user:userLists) {
            UserModel _userModel = new UserModel();
            BeanUtils.copyProperties(_userModel, _user);

            UserHope userHope = userhopeRepository.selectUserHope(_user);
            UserPrevious userPrevious = userpreviousRepository.selectUserPrevious(_user);

            List userJobCategory = new ArrayList<>();
            userJobCategory.add(jobcategoryRepository.selectPMyprofile(userPrevious));
            userJobCategory.add(jobcategoryRepository.selectHMyprofile(userHope));

            List userIndustry = new ArrayList<>();
            userIndustry.add(industryRepository.selectPMyprofile(userPrevious));
            userIndustry.add(industryRepository.selectHMyprofile(userHope));


            UserHopeModel _userHopeModel = new UserHopeModel();
            UserPreviousModel _userPreviousModel = new UserPreviousModel();

            BeanUtils.copyProperties(_userHopeModel, userHope);
            BeanUtils.copyProperties(_userPreviousModel, userPrevious);

            _userModel.setUserHopeModel(_userHopeModel);
            _userModel.setUserPreviousModel(_userPreviousModel);

            userModelLists.add(_userModel);
            userModelLists.add(userJobCategory);
            userModelLists.add(userIndustry);

        }
        ObjectMapper mapper=new ObjectMapper();

        System.err.println(mapper.writeValueAsString(userModelLists));

        return userModelLists;
        /*User user = new User();
        UserPrevious userprevious = new UserPrevious();
        UserHope userhope = new UserHope();
        user.setUserId(user_id);
        userhope.setUserId(user_id);
        userprevious.setUserId(user_id);

        List<User> userLists = userRepository.selectUser(user);
        List<UserModel> userModelLists = new ArrayList<>();

        for(User _user:userLists) {
            UserModel _userModel = new UserModel();
            BeanUtils.copyProperties(_userModel, _user);

            UserHope userHope = userhopeRepository.selectUserHope(_user);
            JobCategory HuserJobCategory = jobcategoryRepository.select(userHope);
            Industry HuserIndustry = industryRepository.selectHIndustry(userHope);

            UserPrevious userPrevious = userpreviousRepository.selectUserPrevious(_user);
            JobCategory userJobCategory = jobcategoryRepository.selectJobCategory(userPrevious);
            Industry userIndustry = industryRepository.selectIndustry(userPrevious);


            UserHopeModel _userHopeModel = new UserHopeModel();
            UserPreviousModel _userPreviousModel = new UserPreviousModel();
            JobCategoryModel _jobCategoryModel = new JobCategoryModel();
            IndustryModel _industryModel = new IndustryModel();

            BeanUtils.copyProperties(_userHopeModel, userHope);
            BeanUtils.copyProperties(_userPreviousModel, userPrevious);
            BeanUtils.copyProperties(_jobCategoryModel, HuserJobCategory);
            BeanUtils.copyProperties(_industryModel, HuserIndustry);
            BeanUtils.copyProperties(_jobCategoryModel, userJobCategory);
            BeanUtils.copyProperties(_industryModel, userIndustry);


            _userModel.setUserHopeModel(_userHopeModel);
            _userModel.setUserPreviousModel(_userPreviousModel);
            _userModel.setJobCategoryModel(_jobCategoryModel);
            _userModel.setIndustryModel(_industryModel);
            userModelLists.add(_userModel);
        }

        return userModelLists;*/
    }

    // マイプロフィール登録画面　新しく登録し直す
    @RequestMapping(value = "/{user_id}/myprofile", method = {RequestMethod.POST}, consumes ={"application/json"})
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
        //previous_idはAutoIncrementで生成しているので、更新時は前のものは全てDeleteし、新しくinsertする
        UserPrevious userprevious=new UserPrevious();
        userprevious.setUserId(user_id);
        userpreviousRepository.delete(userprevious);

        userprevious.setIndustryId(trimSpace(myprofile.getBigIndustry()+myprofile.getMiddleIndustry()+myprofile.getSmallIndustry()));
        userprevious.setCompanyName(myprofile.getP_company());
        userprevious.setJobCategoryId(trimSpace(myprofile.getBigCategory()+myprofile.getMiddleCategory()+myprofile.getSmallCategory()));
        userprevious.setJoinedYear(myprofile.getJoined_year());
        //userpreviousRepository.updateMyprofileUserPrevious(userprevious);
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
        List<Chat> chatLists = chatRepository.selectCaList(chat);

        List lists=new ArrayList<>();
        for(Chat c : chatLists) {
            List caList=new ArrayList<>();
            List caResultIndustry = caresultindustryRepository.selectCaList2(c);
            Ca cA=caRepository.selectChat(c);
            caList.add(cA);
            caList.add(caResultIndustry);

            lists.add(caList);
        }

        return lists;

//        Chat chat = new Chat();
//        chat.setUserId(user_id);
//
//        // ToDo CA成約が複数の場合どうする
//        List<Chat> chatLists = chatRepository.selectCaList(chat);
//        List<ChatModel> chatModelLists = new ArrayList<>();
//
//        for(Chat _chat:chatLists) {
//            ChatModel _chatModel=new ChatModel();
//            BeanUtils.copyProperties(_chatModel,_chat);
//
//            Ca cA=caRepository.selectChat(_chat);
//            CaResultIndustry caResultIndustry=caresultindustryRepository.selectChat(_chat);
//            //Map<String,List>
//
//            CaModel _caModel=new CaModel();
//            CaResultIndustryModel _caResultModel=new CaResultIndustryModel();
//
//            BeanUtils.copyProperties(_caModel, cA);
//            BeanUtils.copyProperties(_caResultModel, caResultIndustry);
//
//            _chatModel.setCaModel(_caModel);
//            _chatModel.setCaResultIndustryModel(_caResultModel);
//
//            chatModelLists.add(_chatModel);
//        }
//        return chatModelLists;

    }

    // ca詳細
    @RequestMapping(value = "/{user_id}/ca/{ca_id}", method = RequestMethod.GET, produces = {"application/json"})
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

//        List jobLists=new ArrayList<>();
//        for (CaResultJobCategory _crj:caResultJobCategory) {
//            JobCategory job = jobcategoryRepository.selectCaJobCategory(_crj);
//            jobLists.add(job);
//        }

//        List indLists=new ArrayList<>();
//        for (CaResultIndustry _cri:caResultIndustry) {
//            Industry ind = industryRepository.selectCaIndustry(_cri);
//            indLists.add(ind);
//        }

        caList.add(ca_person);
        caList.add(caResultCompany);
        caList.add(caResultIndustry);
        caList.add(gender);
        caList.add(place);
        caList.add(caResultJobCategory);
//        caList.add(indLists);
       // caList.add(jobLists);

        return caList;

//        Ca ca=new Ca();
//        ca.setCaId(ca_id);
//
//        // ToDo CA成約が複数の場合どうする
//        Ca cA = caRepository.selectDetail(ca);
//        List<CaModel> caModelLists = new ArrayList<>();
//
//        CaModel _caModel=new CaModel();
//        BeanUtils.copyProperties(_caModel,cA);
//
//        CaResultIndustry caResultIndustry=caresultindustryRepository.selectCaList(cA);
//        CaResultCompany caResultCompany=caresultcompanyRepository.selectCaList(cA);
//        CaResultJobCategory caResultJobCategory=caresultjobcategoryRepository.selectCaList(cA);
//
//        CaResultIndustryModel _caResultIndustryModel=new CaResultIndustryModel();
//        CaResultJobCategoryModel _caResultJobCategoryModel=new CaResultJobCategoryModel();
//        CaResultCompanyModel _caResultCompanyModel=new CaResultCompanyModel();
//
//        BeanUtils.copyProperties(_caModel, cA);
//        BeanUtils.copyProperties(_caResultIndustryModel, caResultIndustry);
//        BeanUtils.copyProperties(_caResultJobCategoryModel,caResultJobCategory);
//        BeanUtils.copyProperties(_caResultCompanyModel,caResultCompany);
//
//        _caModel.setCaResultCompanyModel(_caResultCompanyModel);
//        _caModel.setCaResultIndustryModel(_caResultIndustryModel);
//        _caModel.setCaResultJobCategoryModel(_caResultJobCategoryModel);
//
//        caModelLists.add(_caModel);
//
//        return caModelLists;
  }

    // チャット一覧
    @RequestMapping(value = "/{user_id}/chat", method = RequestMethod.GET, produces = {"application/json"})
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