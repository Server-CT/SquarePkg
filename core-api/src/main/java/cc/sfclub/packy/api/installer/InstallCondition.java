package cc.sfclub.packy.api.installer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class InstallCondition {
    private String env;
    private String condition;
}
