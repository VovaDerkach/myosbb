package com.softserve.osbb.util.paging.impl;

import com.softserve.osbb.dto.ReportDTO;
import com.softserve.osbb.util.paging.PageDataObject;
import org.springframework.hateoas.Resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazar.dovhyy on 08.08.2016.
 */
public class ReportPageDataObject extends PageDataObject<Resource<ReportDTO>> {

    private List<String> dates;

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = new ArrayList<>();
        if (dates != null) {
            dates.stream().filter((d) -> d != null).
                    forEach((date) -> this.dates.add(date.toString()));
        }
    }

}
