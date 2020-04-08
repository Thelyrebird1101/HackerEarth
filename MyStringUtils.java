import java.util.*;
import java.util.stream.Collectors;

public class MyStringUtils {

	public List<String> convertFirstCharacterToUpper(List<String> inStream){
	List<String> upperCased = inStream.stream().
			map(t->t.substring(0,1).toUpperCase() + t.substring(1)).
			collect(Collectors.toList());
		
	return upperCased;
	}
}
