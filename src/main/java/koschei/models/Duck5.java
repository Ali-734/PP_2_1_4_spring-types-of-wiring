package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private Egg6 egg1;

    public Duck5(Egg6 egg1) {
        this.egg1 = egg1;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg1.toString();
    }
}
