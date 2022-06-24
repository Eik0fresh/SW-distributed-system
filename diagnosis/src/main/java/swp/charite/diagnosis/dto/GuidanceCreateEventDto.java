package swp.charite.diagnosis.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swp.charite.diagnosis.model.Priority;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuidanceCreateEventDto {
    private Long id;
    private String guidance;
    private Priority priority;
    private Date date;
    private boolean done;
}
