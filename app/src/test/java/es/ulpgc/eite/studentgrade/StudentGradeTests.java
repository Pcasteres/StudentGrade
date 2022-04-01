package es.ulpgc.eite.studentgrade;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by Luis on marzo, 2022
 */
@RunWith(RobolectricTestRunner.class)
public class StudentGradeTests {

  StudentGradeSteps steps = new StudentGradeSteps();


  @Test
  public void Scenario012A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");

    // When
    steps.iAmOnScreenAndPressButton("student", "outstanding");

    // Then
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");
  }

  @Test
  public void Scenario023A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");

    // When
    steps.iAmOnScreenAndPressButton("student", "mention");

    // Then
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");
  }

  @Test
  public void Scenario034A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");

    // When
    steps.iAmOnScreenAndPressButton("student", "pass");

    // Then
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");
  }

  // -----

  @Test
  public void Scenario0421A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "outstanding");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "lower");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "9", "grade");
  }

  @Test
  public void Scenario0522A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "outstanding");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "higher");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "10", "grade");
  }

  // -----


  @Test
  public void Scenario0631A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "higher");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "8", "grade");
  }

  @Test
  public void Scenario0732A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "lower");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "7", "grade");
  }

  // -----

  @Test
  public void Scenario0841A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "higher");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "6", "grade");
  }


  @Test
  public void Scenario0942A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "lower");

    // Then
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
  }


  // ---------------

  @Test
  public void Scenario102B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "outstanding");
    steps.iAmOnScreen("grade");

    // When
    steps.iRotateScreen("grade");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");
  }

  @Test
  public void Scenario113B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");

    // When
    steps.iRotateScreen("grade");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");
  }

  @Test
  public void Scenario124B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");

    // When
    steps.iRotateScreen("grade");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");
  }


  // -----

  @Test
  public void Scenario1321B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "outstanding");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");
    steps.iAmOnScreenAndPressButton("grade", "lower");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "9", "grade");
  }

  @Test
  public void Scenario1422B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "outstanding");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "9", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "10", "higher");
    steps.iAmOnScreenAndPressButton("grade", "higher");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "10", "grade");
  }

  // -----


  @Test
  public void Scenario1531B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");
    steps.iAmOnScreenAndPressButton("grade", "higher");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "8", "grade");
  }

  @Test
  public void Scenario1632B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");
    steps.iAmOnScreenAndPressButton("grade", "lower");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "7", "grade");
  }

  // -----

  @Test
  public void Scenario1741B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");
    steps.iAmOnScreenAndPressButton("grade", "higher");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "6", "grade");
  }


  @Test
  public void Scenario1842B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");
    steps.iAmOnScreenAndPressButton("grade", "lower");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
  }


  // -----


  @Test
  public void Scenario195A() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");

    steps.iAmOnScreenAndPressButton("grade", "lower");
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");

    // When
    steps.iAmOnScreenAndPressButton("grade", "back");

    // Then
    steps.iBackOnScreen("student");
    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
  }

  @Test
  public void Scenario205B() {

    // Given
    steps.iAmOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "0", "grade");
    steps.iAmOnScreenAndPressButton("student", "pass");
    steps.iAmOnScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "5", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "6", "higher");
    steps.iAmOnScreenAndPressButton("grade", "lower");
    steps.iBackOnScreen("student");
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
    steps.iAmOnScreenAndPressButton("student", "mention");
    steps.iAmOnScreen("grade");
    steps.iRotateScreen("grade");
    steps.iAmOnScreenAndSeeValueOnView("grade", "7", "lower");
    steps.iAmOnScreenAndSeeValueOnView("grade", "8", "higher");
    steps.iAmOnScreenAndPressButton("grade", "back");
    steps.iBackOnScreen("student");

    // When
    steps.iRotateScreen("student");

    // Then
    steps.iAmOnScreenAndSeeValueOnView("student", "5", "grade");
  }

}
