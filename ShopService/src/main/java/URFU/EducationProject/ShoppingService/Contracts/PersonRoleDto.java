package URFU.EducationProject.ShoppingService.Contracts;

import org.springframework.lang.Nullable;

public class PersonRoleDto {
    @Nullable
    private Object[] role;
    private String name;

    public PersonRoleDto(String name, Object[] role) {
        this.name = name;
        this.role = role;
    }

    public Object[] getRole() {
        return role;
    }

    public void setRole(Object[] role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
