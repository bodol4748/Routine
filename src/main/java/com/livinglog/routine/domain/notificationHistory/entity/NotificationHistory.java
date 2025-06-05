package com.livinglog.routine.domain.notificationHistory.entity;

import com.livinglog.routine.domain.routineLog.entity.RoutineLog;
import com.livinglog.routine.domain.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notification_history")
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_history_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "routine_log_id", nullable = false)
    private RoutineLog routineLog;

    @Column(nullable = false)
    private String message;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private boolean success;

    @Column(name = "notification_type", nullable = false)
    private int notificationType;

}
