//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
import java.util.ArrayList;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> intList = new ArrayList<>();
        for(int i=0; i < list.size(); i++){
            if(list.get(i) instanceof Integer) intList.add(list.get(i));
        } return intList;
    }
}