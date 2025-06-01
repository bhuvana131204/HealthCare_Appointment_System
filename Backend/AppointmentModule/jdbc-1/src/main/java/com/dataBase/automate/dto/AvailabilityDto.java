package com.dataBase.automate.dto;

import com.dataBase.automate.model.Specialization;
import com.dataBase.automate.model.TimeSlots;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class AvailabilityDto {
	@NotEmpty
    private String availabilityId;
	@NotNull
    private TimeSlots timeSlots;
	@NotNull
    private LocalDate date;
	@NotEmpty
    private String doctorId;
	@NotNull
    private Specialization specialization;
    
}
