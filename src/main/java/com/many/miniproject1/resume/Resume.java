package com.many.miniproject1.resume;

import com.many.miniproject1.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Table(name = "resume_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Resume {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;

    @JoinColumn(name = "person_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String title;
    private String profile;
    private String portfolio;
    private String introduce;
    private String career;
    private String simpleIntroduce;
    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Resume(Integer id, User user, String title, String profile, String portfolio, String introduce, String career, String simpleIntroduce, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.profile = profile;
        this.portfolio = portfolio;
        this.introduce = introduce;
        this.career = career;
        this.simpleIntroduce = simpleIntroduce;
        this.createdAt = createdAt;
    }

    public void update(ResumeRequest.UpdateDTO reqDTO){
        this.id = reqDTO.getId();
        this.title = reqDTO.getTitle();
        this.profile = reqDTO.getProfile();
        this.portfolio = reqDTO.getPortfolio();
        this.introduce = reqDTO.getIntroduce();
        this.career = reqDTO.getCareer();
        this.simpleIntroduce = reqDTO.getSimpleIntroduce();
    }
}