package URFU.EducationProject.ShoppingService.Contracts;

public class AdminRoleDto {
    private Object[] role;
    private String name;

    public AdminRoleDto(String name, Object[] role) {
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
