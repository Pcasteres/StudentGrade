package es.ulpgc.eite.studentgrade.student;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.studentgrade.app.AppMediator;
import es.ulpgc.eite.studentgrade.app.GradeToStudentState;
import es.ulpgc.eite.studentgrade.app.StudentToGradeState;

/**
 * Created by Luis on marzo, 2022
 */
public class StudentPresenter implements StudentContract.Presenter {

  public static String TAG = "StudentGrade.StudentPresenter";

  private WeakReference<StudentContract.View> view;
  private StudentState state;
  private StudentContract.Model model;
  private AppMediator mediator;

  public StudentPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getStudentState();
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // TODO: include code here if is necessary
    state.data = Integer.toString(0);

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: include code here if is necessary
    model.onRestartScreen(state.data);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // use passed state if is necessary
    GradeToStudentState savedState = getStateFromNextScreen();
    if (savedState != null) {
      state.data = savedState.data;

      // TODO: include code here if is necessary

    }
      view.get().onDataUpdated(state);
    // TODO: include code here if is necessary

  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");

    // TODO: include code here if is necessary

  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // TODO: include code here if is necessary

  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");

    // TODO: include code here if is necessary

  }

  @Override
  public void onOutstandingGradeBtnClicked() {
    Log.e(TAG, "Sobresaliente");
    // TODO: include code here if is necessary
    String pasa = model.getStoredData();
    StudentToGradeState newState = new StudentToGradeState();
    newState.outstandingGradeBtnClicked = true;
    newState.mentionGradeBtnClicked = false;
    newState.passGradeBtnClicked = false;
    passStateToNextScreen(newState);
    view.get().navigateToNextScreen();
  }

  @Override
  public void onMentionGradeBtnClicked() {
      Log.e(TAG, "Notable");
    // TODO: include code here if is necessary
    String pasa = model.getStoredData();
    StudentToGradeState newState = new StudentToGradeState();
    newState.outstandingGradeBtnClicked = false;
    newState.mentionGradeBtnClicked = true;
    newState.passGradeBtnClicked = false;
    passStateToNextScreen(newState);
    view.get().navigateToNextScreen();

  }

  @Override
  public void onPassGradeBtnClicked() {
    Log.e(TAG, "Suficiente");
    StudentToGradeState newState = new StudentToGradeState();
    newState.outstandingGradeBtnClicked = false;
    newState.mentionGradeBtnClicked = false;
    newState.passGradeBtnClicked = true;
    passStateToNextScreen(newState);
    view.get().navigateToNextScreen();

  }

  private GradeToStudentState getStateFromNextScreen() {
    return mediator.getNextStudentScreenState();
  }

  private void passStateToNextScreen(StudentToGradeState state) {
    mediator.setNextStudentScreenState(state);
  }


  @Override
  public void injectView(WeakReference<StudentContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(StudentContract.Model model) {
    this.model = model;
  }

}
