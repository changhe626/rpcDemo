package impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        System.out.println("this cousmer X  is coming. the number is " + id);
        List<String> demo = new ArrayList<String>();
        int id2=id.intValue();
        switch (id2) {
            case 1:
                demo.add("2昭君----1");
                break;
            case 2:
                demo.add("2 i  love  you-----2");
                break;
            case 3:
                demo.add("2very  much.----3");
                break;
            case 4:
                demo.add("2very  very much,---4");
                break;
        }
        return demo;
    }
}
