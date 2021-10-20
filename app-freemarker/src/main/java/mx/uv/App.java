package mx.uv;

import static spark.Spark.*;

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import freemarker.template.Configuration;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        staticFileLocation("/views");

        Configuration viewDir = new Configuration();

        viewDir.setClassForTemplateLoading(App.class, "/views");

        get("/ping", (req, res) -> "pong\n");

        get("/hola1", (request, response) -> {

            HashMap<String, Object> model = new HashMap<>();

            model.put("name", "Equipo 2");

            return new ModelAndView(model, "hola1.ftl");

        }, new FreeMarkerEngine(viewDir));
    } 
}
