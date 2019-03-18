package kr.hs.dgsw.project_02_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController
{
    @Autowired
    CalculatorService service;

    @GetMapping("cal/{a}/{b}/{c}")
    public String calculate(@PathVariable int a, @PathVariable int b, @PathVariable String c)
    {
        return service.cal(a, b, c);
    }
}
