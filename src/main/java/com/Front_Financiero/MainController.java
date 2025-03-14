package com.Front_Financiero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        // Redirige todas las rutas a index.html para que Angular maneje el enrutamiento
        return "forward:/index.html";
    }
}
