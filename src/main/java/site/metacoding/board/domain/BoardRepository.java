package site.metacoding.board.domain;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
// interface로 안만들고 직접
@Repository
public class BoardRepository {
    // 아래 클래스로 직접 쿼리를 작성 할 수 있다
    private final EntityManager em;
}
