package me.fatezero.yaples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
//@RestController
public class yaplesApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(yaplesApplication.class);
        // 监控应用的 PID，启动时可指定 PID 路径：--spring.pid.file=/home/yaples-admin/app.pid
        // 或者在 application.yml 添加文件路径，方便 kill，kill `cat /home/yaples-admin/app.pid`
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

//    @GetMapping("/")
//    public String index() {
//        return "Backend service start success";
//    }
}
