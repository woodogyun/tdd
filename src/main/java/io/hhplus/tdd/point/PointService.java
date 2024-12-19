package io.hhplus.tdd.point;
import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.database.UserPointTable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PointService {
    private final UserPointTable userPointTable;
    private final PointHistoryTable pointHistoryTable;

    public UserPoint selectById(long id) {
        return new UserPoint(0, 0, 0);
    }
    public List<PointHistory> selectAllByUserId(long id) {
        return List.of();
    }
    public UserPoint charge(long id, long amount) {
        return new UserPoint(0, 0, 0);
    }
    public UserPoint use(long id, long amount) {
        return new UserPoint(0, 0, 0);
    }
}