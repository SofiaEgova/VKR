package vkr.VKR.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vkr.VKR.models.TimeSeries;

public interface TimeSeriesRepo extends JpaRepository<TimeSeries,Long> {

}
