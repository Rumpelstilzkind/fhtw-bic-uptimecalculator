package at.fhtw.bic.uptimecalculatorbic.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeController {
    @GetMapping("/uptime")
    public double calculateUptimeMinutes(@RequestParam double relative) {
        double minutesOfMonth = 60*24*30;
        double defineUptimeInPercent = relative /100;
        return minutesOfMonth * defineUptimeInPercent; //uptiime in minutes
    }

    @GetMapping("/uptime/hours")
    public double  calculateUptimeHours(@RequestParam double relative) {
        double hoursOfMonth = 24*30;
        double defineUptimeInPercent = relative / 100;
        return hoursOfMonth * defineUptimeInPercent; //uptime in hours

    }
}
