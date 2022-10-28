package aka.memo.util;

import java.util.Collection;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class MyMapperUtil {
  
  private MyMapperUtil() {
    // hide constructor.
  }

  private static final ModelMapper modelMapper;
  static {
    modelMapper = new ModelMapper();
    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
  }

  public static <D, T> List<D> mapList(final Collection<T> srcList, Class<D> destClass) {
    return srcList.stream().map(e -> map(e, destClass)).toList();

  }

  public static <S, D> D map(final S source, Class<D> destClass) {
    return modelMapper.map(source, destClass);
  }
}
