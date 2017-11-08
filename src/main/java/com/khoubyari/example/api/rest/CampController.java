package com.khoubyari.example.api.rest;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.khoubyari.example.dao.jpa.CARepository;
import com.khoubyari.example.domain.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import com.khoubyari.example.service.CampService;

import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


/*
 * Demonstrates how to set up RESTful API endpoints using Spring MVC
 */
// コントローラークラスだよっていうおまじない
@RestController
@RequestMapping(value = "/v1/api/camp")
@Api(tags = {"camp"})
public class CampController extends AbstractRestHandler {


    @Autowired
    private CampService campService;

    // welcome画面
    @RequestMapping(value = "/welcome" , method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String welcome()throws Exception{
        // ToDo:プルダウン要素全て返す
        Academic academic = new Academic();
        academic.setAcademic_id("1");
        academic.setAcademic("aa");
        English english = new English();
        Gender gender = new Gender();
        Industry industry=new Industry();
        Job_category job_category=new Job_category();
        job_category.setJob_category_id("1");
        job_category.setBig_category("エンジニア");
        job_category.setMiddle_category("WEBエンジニア");
        job_category.setSmall_category("ディレクター");
        Major major=new Major();
        Place place = new Place();
        Term term = new Term();
        Timing timing=new Timing();
        Times times=new Times();
        Work work = new Work();

        Map<String,String> strNull = new HashMap<>();
        strNull.put("null","");
        Map<String,String> ms_category = new HashMap<>();
        ms_category.put(job_category.getMiddle_category(),job_category.getSmall_category());

        Map<String,Map<String,String>> academicMiddle = new HashMap<>();
        Map<String,Map<String,String>> englishMiddle = new HashMap<>();
        Map<String,Map<String,String>> genderMiddle = new HashMap<>();
        Map<String,Map<String,String>> industryMiddle = new HashMap<>();
        Map<String,Map<String,String>> majorMiddle = new HashMap<>();
        Map<String,Map<String,String>> placeMiddle = new HashMap<>();
        Map<String,Map<String,String>> termMiddle = new HashMap<>();
        Map<String,Map<String,String>> timingMiddle = new HashMap<>();
        Map<String,Map<String,String>> timesMiddle = new HashMap<>();
        Map<String,Map<String,String>> workMiddle = new HashMap<>();
        Map<String,Map<String,String>> job_categoryMiddle = new HashMap<>();

        Map<String,Map<String,Map<String,String>>> academicValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> englishValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> genderValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> industryValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> majorValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> placeValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> termValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> timingValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> timesValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> workValue=new HashMap<>();
        Map<String,Map<String,Map<String,String>>> job_categoryValue=new HashMap<>();

        academicMiddle.put(academic.getAcademic(),strNull);
        genderMiddle.put(major.getMajor(),strNull);
        englishMiddle.put(english.getEnglish(),strNull);
        industryMiddle.put(industry.getIndustry(),strNull);
        majorMiddle.put(major.getMajor(),strNull);
        placeMiddle.put(place.getPlace(),strNull);
        termMiddle.put(term.getTerm(),strNull);
        timingMiddle.put(timing.getTiming(),strNull);
        timesMiddle.put(times.getTimes(),strNull);
        workMiddle.put(work.getWork(),strNull);
        job_categoryMiddle.put(job_category.getBig_category(),ms_category);

        academicValue.put(academic.getAcademic_id(),academicMiddle);
        englishValue.put(english.getEnglish_id(),englishMiddle);
        genderValue.put(gender.getGender_id(),genderMiddle);
        industryValue.put(industry.getIndustry_id(),industryMiddle);
        majorValue.put(major.getMajor_id(),majorMiddle);
        placeValue.put(place.getPlace_id(),placeMiddle);
        termValue.put(term.getTerm_id(),termMiddle);
        timingValue.put(timing.getTiming_id(),timingMiddle);
        timesValue.put(times.getTimes_id(),timesMiddle);
        workValue.put(work.getWork_id(),workMiddle);
        job_categoryValue.put(job_category.getJob_category_id(),job_categoryMiddle);

        Map<String,Map<String,Map<String,Map<String,String>>>> pulldown= new HashMap<>();

        pulldown.put("academic",academicValue);
        pulldown.put("english",englishValue);
        pulldown.put("gender",genderValue);
        pulldown.put("industry",industryValue);
        pulldown.put("major",majorValue);
        pulldown.put("place",placeValue);
        pulldown.put("term",termValue);
        pulldown.put("timing",timingValue);
        pulldown.put("times",timesValue);
        pulldown.put("work",workValue);
        pulldown.put("job_category",job_categoryValue);

        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pulldown);
        return json;
    }

    // ログイン画面
    @RequestMapping(value = "/login", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(@RequestBody User login){
        // ToDo:正しいものか確認するところ実装
        return login.toString();
    }

    // 初期登録画面
    @RequestMapping(value = "/{user_id}/question/basic", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String basic(@RequestBody User basic,@PathVariable String user_id){
        // IDはクエリから取得
        basic.setUser_id(user_id);
        // DBにinsert
        campService.createUser(basic);
        // DBから値取得
        User _basic = campService.getUser(basic.getUser_id());
        return basic.toString();
    }

    // オプション登録画面
    @RequestMapping(value = "/{user_id}/question/option", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String option(@RequestBody User option,@PathVariable String user_id){
        // IDはクエリから取得
        option.setUser_id(user_id);
        // DBにinsert
        campService.createUser(option);
        // DBから値取得
        User _option = campService.getUser(option.getUser_id());
        System.err.println(_option.getUser_id());
        return option.toString();
    }

    // プロフィール登録画面
    @RequestMapping(value = "/{user_id}/myprofile", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String myprofile(@RequestBody User myprofile,@PathVariable String user_id){
        // IDはクエリから取得
        myprofile.setUser_id(user_id);
        // DBにinsert
        campService.createUser(myprofile);
        // DBから値取得
        User _myprofile = campService.getUser(myprofile.getUser_id());
        System.err.println(_myprofile.getUser_id());
        return myprofile.toString();
    }

    // お問い合わせ画面
    @RequestMapping(value = "/{user_id}/contact", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String contact(@RequestBody Contact contact,@PathVariable String user_id){
        // IDはクエリから取得
        contact.setRequester_id(user_id);
        // DBにinsert
        campService.createContact(contact);
        // DBから値取得
        return contact.toString();
    }

    // campへのご要望画面
    @RequestMapping(value = "/{user_id}/camp_request", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String camp_request(@RequestBody Request camp_request, @PathVariable String user_id){
        camp_request.setRequester_id(user_id);
        // DBにinsert
        campService.createRequest(camp_request);
        // DBから値取得
        return camp_request.toString();
    }

    // ユーザからの評価画面
    @RequestMapping(value = "/{user_id}/review", method = {RequestMethod.GET}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String review(@RequestBody User_review review, @PathVariable String user_id){
        review.setUser_id(user_id);
        // DBにinsert
        campService.createUser_review(review);
        return review.toString();
    }

    // ca一覧
    @RequestMapping(value="/{user_id}/ca",method=RequestMethod.GET,produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String ca_list(@PathVariable String user_id,
                         HttpServletRequest request, HttpServletResponse response) throws Exception {
        CA ca = new CA();

        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ca);
        return json;
    }

    // ca詳細
    @RequestMapping(value = "/{user_id}/ca/{ca_id}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String ca_detail(@PathVariable String user_id,@PathVariable String ca_id) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        CA ca = new CA();
        //CA ca = campService.getCA(ca_id);
        //CA_result ca_result= campService.getCA_result(ca_id);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ca);
        return json;
    }

    // チャット一覧
    @RequestMapping(value = "/{user_id}/chat", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String chat_list(@PathVariable String user_id) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Chat chat = new Chat();
        chat.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(chat);
        return json;
    }

    // チャット詳細
    @RequestMapping(value = "/{user_id}/chat/{chat_id}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String chat_detail(@PathVariable String user_id, @PathVariable String chat_id) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
    }

    // マイプロフィール画面
    @RequestMapping(value="/{user_id}/myprofile", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String user_list(@PathVariable String user_id) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
    }

    // お知らせ一覧
    @RequestMapping("/{user_id}/notice")
    @ResponseBody
    public String notice_list(@PathVariable String user_id) throws Exception{
        // noticeDBに接続して値を取得
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
    }

    // お知らせ詳細
    @RequestMapping("/{user_id}/notice/{notice_id}")
    @ResponseBody
    public String notice_detail(@PathVariable String user_id, String notice_id) throws Exception{
        // noticeDBに接続して値を取得
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
    }

    // Q&A画面
    @RequestMapping("/{user_id}/Q&A")
    @ResponseBody
    public String q_a(@PathVariable String user_id) throws Exception{
        // Q&ADBに接続して値を取得
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
    }

    // 利用規約画面
    @RequestMapping("/{user_id}/tos")
    @ResponseBody
    public String tos(@PathVariable String user_id) throws Exception{
        // Q&ADBに接続して値を取得
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUser_id(user_id);
        //String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hotel.getUser_id());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        return json;
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
    @RequestMapping(value = "前にURL？/{id}",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    // APIの操作や、パスなどの情報を設定/該当するIDを渡す
    @ApiOperation(value = "Get a single hotel.", notes = "You have to provide a valid hotel ID.")
    public
    @ResponseBody
        // APIの値に関する情報を設定
        // @RequestMappingと対応するパラメータを@PathVariableの引数に渡す
    User getHotel(@ApiParam(value = "The ID of the hotel.", required = true)
                             @PathVariable("id") String user_id,
                             HttpServletRequest request, HttpServletResponse response) throws Exception {
        User hotel = this.campService.getUser(user_id);
        checkResourceFound(hotel);
        //todo: http://goo.gl/6iNAkz
        return hotel;
    }

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
    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Delete a hotel resource.", notes = "You have to provide a valid hotel ID in the URL. Once deleted the resource can not be recovered.")
    public void deleteHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
                                 @PathVariable("id") String user_id, HttpServletRequest request,
                                 HttpServletResponse response) {
        checkResourceFound(this.campService.getUser(user_id));
        this.campService.deleteUser(user_id);
    }
}