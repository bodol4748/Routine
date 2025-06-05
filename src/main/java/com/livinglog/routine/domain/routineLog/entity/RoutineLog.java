package com.livinglog.routine.domain.routineLog.entity;

import com.livinglog.routine.domain.notificationHistory.entity.NotificationHistory;
import com.livinglog.routine.domain.routine.entity.Routine;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "routine_log")
public class RoutineLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_log_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable = false)
    private Routine routine;

    @Column(nullable = false)
    private boolean completed;

    @Column(nullable = false)
    private LocalDateTime date;

    @OneToMany(mappedBy = "routineLog", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<NotificationHistory> notificationHistoryList = new ArrayList<>();
}
