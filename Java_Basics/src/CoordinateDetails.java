import java.util.List;

public interface CoordinateDetails {
	void findnearest(List<Integer> values);
	void findnearesttwiththreecoordinations
}


employee(id int, name varchar, salary number, department varchar)

select e.name from employee e order by e.salary asc limit 1;

select e.name from employee e where e.salary = (Select MIN(SALARY) from Employee)