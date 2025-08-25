package hamza.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class CurrencyController
{
    public String res;
    @Autowired
    private CurrencyServiceConfiguration currency; // Injection automatique
    @RequestMapping("/currenczy")
    public CurrencyServiceConfiguration getCurrency()
    {
        return currency;
    }
}
