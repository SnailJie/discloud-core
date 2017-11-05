package org.jren.discloud;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Controller
public class IndexController{
	private static final String FTL_PATH = "/manage";
	
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(){
        return FTL_PATH + "/login";
    }
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String ret ="Fuck Man";
            response.setStatus(200);
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(ret);
        } catch (Throwable t) {
        }
    }
	
	
}