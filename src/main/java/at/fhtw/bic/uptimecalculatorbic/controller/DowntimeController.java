package at.fhtw.bic.uptimecalculatorbic.controller;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DowntimeController {
    @GetMapping("/downtime/minutes")
    public double calculateUptimeMinutes(@RequestParam double relative) {
        double minutesOfMonth = 60*24*30;
        double defineUptimeInPercent = relative /100;
        return minutesOfMonth * defineUptimeInPercent; //uptime in minutes
    }

    public double calculateDowntimeMinutes(double v) {
        return 0.0;
    }
}
