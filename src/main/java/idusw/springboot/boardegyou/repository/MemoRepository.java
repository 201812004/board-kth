package idusw.springboot.boardegyou.repository;

import idusw.springboot.boardegyou.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
