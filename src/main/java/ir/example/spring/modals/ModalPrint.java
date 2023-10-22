package ir.example.spring.modals;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModalPrint {
    private String name;
    private String family;
    private Integer age;
}
