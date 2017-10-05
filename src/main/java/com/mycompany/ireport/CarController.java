package com.mycompany.ireport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

@Controller
public class CarController {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private ICarService carService;

    @RequestMapping(path = "/pdf", method = RequestMethod.GET)
    public ModelAndView report() {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:report2.jrxml");
        view.setApplicationContext(appContext);
        
        List<CarSend> cars = new ArrayList();
        for (Car carro : carService.findAll()) {
            cars.add(new CarSend(carro.getId(), carro.getName(), carro.getPrice()));
        }

        Map<String, Object> params = new HashMap<>();
        params.put("datasource", cars);

        return new ModelAndView(view, params);
    }
}