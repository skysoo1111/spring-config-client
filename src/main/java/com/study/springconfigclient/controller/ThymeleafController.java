package com.study.springconfigclient.controller;
import com.study.springconfigclient.service.DynamicConfigService;
import com.study.springconfigclient.service.StaticConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class ThymeleafController {
    private final StaticConfigService staticConfigService;
    private final DynamicConfigService dynamicConfigService;

    @GetMapping("/view")
    public ModelAndView testView(ModelAndView mv) {

        String staticConfig = staticConfigService.getConfig();
        String dynamicConfig = dynamicConfigService.getConfig();
        mv.addObject("staticConfig", staticConfig);
        mv.addObject("dynamicConfig", dynamicConfig);
        mv.setViewName("test");
        return mv;
    }
}
