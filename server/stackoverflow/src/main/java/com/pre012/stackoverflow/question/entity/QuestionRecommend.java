package com.pre012.stackoverflow.question.entity;

import com.pre012.stackoverflow.member.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class QuestionRecommend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qrid;

    @JoinColumn(name="qid")
    @ManyToOne
    private Question question;

    @JoinColumn(name="mid")
    @ManyToOne
    private Member member;
}
