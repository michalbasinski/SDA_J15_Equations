package pl.sda.solvers;

import org.junit.Test;
import pl.sda.model.Equation;
import pl.sda.model.EquationBuilder;
import pl.sda.solver.EquationSolver;

import static org.junit.Assert.*;

public class EquationSolverTest {

    private EquationSolver equationSolver = new EquationSolver();

    @Test
    public void shouldReturn2WhenEquationIs2xMINUS4Eq0() {
        //given
        EquationBuilder builder = new EquationBuilder();
        final Equation equation = builder.withA(2d).withB(-4d).withC(0d).build();
        final Double expectedResult = 2d;

        //when
        Double result = equationSolver.solve(equation);

        //then
        assertEquals(expectedResult, result);
    }
}