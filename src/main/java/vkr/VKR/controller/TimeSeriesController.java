package vkr.VKR.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vkr.VKR.models.TimeSeries;
import vkr.VKR.repo.TimeSeriesRepo;

import java.util.List;

@RestController
@RequestMapping("ts")
public class TimeSeriesController {
    private final TimeSeriesRepo tsrep;

    @Autowired
    public TimeSeriesController(TimeSeriesRepo tsrep) {
        this.tsrep = tsrep;
    }

    @GetMapping("")
    public List<TimeSeries> main(){
        return tsrep.findAll();
    }

    @GetMapping("{id}")
    public TimeSeries getOne(@PathVariable("id") TimeSeries ts){
        return ts;
    }
}
