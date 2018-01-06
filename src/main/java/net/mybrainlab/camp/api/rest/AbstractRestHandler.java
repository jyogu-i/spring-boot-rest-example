package net.mybrainlab.camp.api.rest;

//import com.khoubyari.example.domain.RestErrorInfo;
import net.mybrainlab.camp.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * This class is meant to be extended by all REST resource "controllers".
 * It contains exception mapping and other common REST API functionality
 */
//@ControllerAdvice?
    // エラーの対処とか、特定イベントの対処
public abstract class AbstractRestHandler implements ApplicationEventPublisherAware {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    protected ApplicationEventPublisher eventPublisher;

    protected static final String  DEFAULT_PAGE_SIZE = "100";
    protected static final String DEFAULT_PAGE_NUM = "0";

    // クライアントにレスポンスを返す際のステータスコード。ここでは400を返す設定？
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    // DataFormatExceptionが発生した場合handleDataStoreExceptionメソッドで対処
//    @ExceptionHandler(DataFormatException.class)
//    public
//    // returnがそのままのレスポンス内容になる
//    @ResponseBody
//    RestErrorInfo handleDataStoreException(DataFormatException ex, WebRequest request, HttpServletResponse response) {
//        log.info("Converting Data Store exception to RestResponse : " + ex.getMessage());
//
//        return new RestErrorInfo(ex, "You messed up.");
//    }
//
//    // クライアントにレスポンスを返す際のステータスコード。ここでは404を返す設定？
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    // ResourceNotFoundExceptionが発生した場合handleResourceNotFoundExceptionメソッドで対処
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public
//    // returnがそのままのレスポンス内容になる
//    @ResponseBody
//    RestErrorInfo handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request, HttpServletResponse response) {
//        log.info("ResourceNotFoundException handler:" + ex.getMessage());
//
//        return new RestErrorInfo(ex, "Sorry I couldn't find it.");
//    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    //todo: replace with exception mapping　関数置き換え
    public static <T> T checkResourceFound(final T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException("resource not found");
        }
        return resource;
    }

}