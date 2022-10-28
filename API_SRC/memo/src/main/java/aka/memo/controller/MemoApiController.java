package aka.memo.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import aka.memo.generated.api.MemoApi;
import aka.memo.generated.model.MemoView;
import aka.memo.service.MemoService;

@RestController
public class MemoApiController implements MemoApi {
  
  @Autowired
  MemoService memoGroupsService;

  private static final Logger log = LoggerFactory.getLogger(MemoApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public MemoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  @Override
  public Optional<ObjectMapper> getObjectMapper() {
    return Optional.ofNullable(objectMapper);
  }

  @Override
  public Optional<HttpServletRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<MemoView> memos(String userId, String threadId) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      MemoView result = memoGroupsService.getMemoView(userId, threadId);
      if(log.isInfoEnabled())
        log.info(result.toString());
      return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    
    return new ResponseEntity<MemoView>(HttpStatus.NOT_IMPLEMENTED);
  }

}
