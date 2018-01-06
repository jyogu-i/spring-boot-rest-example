package net.mybrainlab.camp.service;

//import com.khoubyari.example.dao.jpa.*;
//import com.khoubyari.example.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Sample service to demonstrate what the API would use to get things done
 * サービスクラス＝なんらかの処理を実装するクラス
 * DBアクセスしている
 */
@Service
public class CampService {

    private static final Logger log = LoggerFactory.getLogger(CampService.class);

    //型が一致するクラスをDIする。
  //  @Autowired
//    private UserRepository userRepository;
//    private CARepository caRepository;
//    private CA_Result_Job_CategoryRepository ca_result_job_categoryRepository;
//    private CA_Result_CompanyRepository ca_result_companyRepository;
//    private CA_Result_IndustryRepository ca_result_industryRepository;
//    private ChatRepository chatRepository;
//    private ContactRepository contactRepository;
//    private MessageRepository messageRepository;
//    private NoticeRepository noticeRepository;
//    private Q_ARepository q_aRepository;
//    private RequestRepository requestRepository;
//    private User_hopeRepository user_hopeRepository;
//    private User_previousRepository user_previousRepository;
//    private User_reviewRepository user_reviewRepository;
//    private AcademicRepository academicRepository;
//    private EnglishRepository englishRepository;
//    private GenderRepository genderRepository;
//    private IndustryRepository industryRepository;
//    private Job_categoryRepository job_categoryRepository;
//    private PlaceRepository placeRepository;
//    private MajorRepository majorRepository;
//    private TermRepository termRepository;
//    private TimesRepository timesRepository;
//    private TimingRepository timingRepository;
//    private WorkRepository workRepository;

    @Autowired
    CounterService counterService;

    @Autowired
    GaugeService gaugeService;

    public CampService() {
    }

    // user情報は全て可能
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public User getUser(String user_id) {
//        return userRepository.findOne(user_id);
//    }
//
//    public void updateUser(User user) {
//        userRepository.save(user);
//    }
//
//    public void deleteUser(String user_id) {
//        userRepository.delete(user_id);
//    }
//
//    // ca情報は参照のみ
//    public CA getCA(String ca_id) {
//        return caRepository.findOne(ca_id);
//    }
//
//    // ca_result情報は参照のみ
//    public CA_result_job_category getResult_job_category(String result_job_cetegory_id) {
//        return ca_result_job_categoryRepository.findOne(result_job_cetegory_id);
//    }
//    public CA_result_industry getResult_industry(String result_industry_id) {
//        return ca_result_industryRepository.findOne(result_industry_id);
//    }
//    public CA_result_company getResult_company(String result_company_id) {
//        return ca_result_companyRepository.findOne(result_company_id);
//    }
   /* public List<Academic> getResult_academic(){
        return academicRepository.findAll();
    }*/


    // お問い合わせ情報は送るのみ
//    public Contact createContact(Contact contact) {
//        return contactRepository.save(contact);
//    }
//
//    // ご要望情報は送るのみ
//    public Request createRequest(Request request) {
//        return requestRepository.save(request);
//    }
//
//    // お知らせ情報は参照のみ
//    public Notice getNotice(String notice_id) {
//        return noticeRepository.findOne(notice_id);
//    }
//
//    // チャット情報は参照のみ
//    public Chat getChat(String chat_id) {
//        return chatRepository.findOne(chat_id);
//    }
//
//    // チャットメッセージ情報は作成・参照のみ
//    public Message createMessage(Message message) {
//        return messageRepository.save(message);
//    }
//
//    public Message getMessage(String message_id) {
//        return messageRepository.findOne(message_id);
//    }
//
//    // Q&A情報は参照のみ
//    public Q_A getQ_A(String q_a_id) {
//        return q_aRepository.findOne(q_a_id);
//    }
//
//    // レビュー情報は作成のみ
//    public User_review createUser_review(User_review review) {
//        return user_reviewRepository.save(review);
//    }
//
//    public List<Academic> getAcademicTest() {
//        return academicRepository.findAll();
    }
//    public List<Academic> getAcademicTest() {
//        List<Academic> itr = academicRepository.findAll();
//        for (Academic data : itr) {
//            System.out.println(data.getAcademic_id());
//        }
//        return itr;
//    }
    // プルダウン情報は参照のみ
//    public Academic getAcademic(int academic_id) {
//        return academicRepository.findOne(academic_id);
//    }
//    public English getEnglish(int english_id) {
//        return englishRepository.findOne(english_id);
//    }
//    public Gender getGender(int gender_id) {
//        return genderRepository.findOne(gender_id);
//    }
//    public Industry getIndustry(int industry_id) {
//        return industryRepository.findOne(industry_id);
//    }
//    public Job_category getJob_category(int job_category_id) {
//        return job_categoryRepository.findOne(job_category_id);
//    }
//    public Place getPlace(int place_id) {
//        return placeRepository.findOne(place_id);
//    }
//    public Major getMajor(int major_id) {
//        return majorRepository.findOne(major_id);
//    }
//    public Term getTerm(int term_id) {
//        return termRepository.findOne(term_id);
//    }
//    public Times getTimes(int times_id) {
//        return timesRepository.findOne(times_id);
//    }
//    public Timing getTiming(int timing_id) {
//        return timingRepository.findOne(timing_id);
//    }
//    public Work getWork(int work_id) {
//        return workRepository.findOne(work_id);
//    }




    //http://goo.gl/7fxvVf
   /* public Page<User> getAllHotels(Integer page, int size) {
        Page pageOfHotels = userRepository.findAll(new PageRequest(page, size));
        // example of adding to the /metrics
        if (size > 50) {
            counterService.increment("Khoubyari.HotelService.getAll.largePayload");
        }
        return pageOfHotels;
    }*/
//}
