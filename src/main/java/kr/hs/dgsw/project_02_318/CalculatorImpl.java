package kr.hs.dgsw.project_02_318;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorService {
    @Override
    public String cal(int a, int b, String ope) {
        int tmp = 0;
        try
        {
            if(ope.equals("pl"))
            {
                tmp = (a + b);
            }
            else if(ope.equals("mi"))
            {
                tmp = a - b;
            }
            else if(ope.equals("mu"))
            {
                tmp = a * b;
            }
            else if(ope.equals("di"))
            {
                tmp = a / b;
            }
        }
        catch(Exception e)
        {
            return "AA";
        }

        return "답은 " + tmp;
    }
}
