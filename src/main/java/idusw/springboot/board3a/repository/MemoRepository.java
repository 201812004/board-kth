package idusw.springboot.board3a.repository;

import idusw.springboot.board3a.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
