package com.learning.userservice.config;

import com.learning.userservice.scheduler.UserMaintenanceJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail userMaintenanceJobDetail() {
        return JobBuilder.newJob(UserMaintenanceJob.class)
                .withIdentity("userMaintenanceJob")
                .withDescription("Job to perform user maintenance tasks")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger userMaintenanceJobTrigger() {
        // Run every 15 minutes for demo purposes
        return TriggerBuilder.newTrigger()
                .forJob(userMaintenanceJobDetail())
                .withIdentity("userMaintenanceJobTrigger")
                .withDescription("Trigger for user maintenance job")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInMinutes(15)
                        .repeatForever())
                .build();
    }

    // Alternative cron-based trigger (commented out)
    /*
    @Bean
    public Trigger userMaintenanceJobCronTrigger() {
        return TriggerBuilder.newTrigger()
                .forJob(userMaintenanceJobDetail())
                .withIdentity("userMaintenanceJobCronTrigger")
                .withDescription("Cron trigger for user maintenance job")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/30 * * * ?")) // Every 30 minutes
                .build();
    }
    */

    // Additional job for user statistics
    @Bean
    public JobDetail userStatisticsJobDetail() {
        return JobBuilder.newJob()
                .ofType(UserStatisticsJob.class)
                .withIdentity("userStatisticsJob")
                .withDescription("Job to generate user statistics")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger userStatisticsJobTrigger() {
        return TriggerBuilder.newTrigger()
                .forJob(userStatisticsJobDetail())
                .withIdentity("userStatisticsJobTrigger")
                .withDescription("Trigger for user statistics job")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0 */6 * * ?")) // Every 6 hours
                .build();
    }

    // Custom job for user statistics
    public static class UserStatisticsJob implements Job {
        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            System.out.println("=== Quartz User Statistics Job Executed - " + 
                             java.time.LocalDateTime.now() + " ===");
            
            // This would typically inject services, but for demo we'll just log
            System.out.println("Generating comprehensive user statistics...");
            System.out.println("Statistics generation completed!");
        }
    }
}