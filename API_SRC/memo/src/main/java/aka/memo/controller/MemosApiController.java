package aka.memo.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import aka.memo.generated.api.MemosApi;
import aka.memo.generated.model.MemoGroups;
import aka.memo.service.MemoGroupsService;

@RestController
public class MemosApiController implements MemosApi {
  
  @Autowired
  MemoGroupsService memoGroupsService;

  private static final Logger log = LoggerFactory.getLogger(MemosApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public MemosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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

  public ResponseEntity<MemoGroups> memos() {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      MemoGroups result = memoGroupsService.getMemoGroups();
      if(log.isInfoEnabled())
        log.info(result.toString());
      return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    
    return new ResponseEntity<MemoGroups>(HttpStatus.NOT_IMPLEMENTED);
  }

}
