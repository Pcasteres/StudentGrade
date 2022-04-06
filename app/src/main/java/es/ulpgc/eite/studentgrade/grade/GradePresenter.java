package es.ulpgc.eite.studentgrade.grade;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.studentgrade.app.AppMediator;
import es.ulpgc.eite.studentgrade.app.GradeToStudentState;
import es.ulpgc.eite.studentgrade.app.StudentToGradeState;

/**
 * Created by Luis on marzo, 2022
 */
public class GradePresenter implements GradeContract.Presenter {

  public static String TAG = "StudentGrade.GradePresenter";

  private WeakReference<GradeContract.View> view;
  private GradeState state;
  private GradeContract.Model model;
  private AppMediator mediator;

  public GradePresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getGradeState();
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // TODO: include code here if is necessary

    // use passed state if is necessary
    StudentToGradeState savedState = getStateFromPreviousScreen();
    if (savedState != null) {
      //Como he creado un array de notas tendremos en cuenta
      //el valor según la posicion de este
      int posUno, posDos;
      // TODO: include code here if is necessary
      if(savedState.outstandingGradeBtnClicked){
        posUno = 0;
        posDos = 1;
      }else if(savedState.mentionGradeBtnClicked){
        posUno = 2;
        posDos = 3;
      }else if(savedState.passGradeBtnClicked){
        posUno = 4;
        posDos = 5;
      }else{
        posUno = posDos = 0;
      }
     // Aquí es donde me surge la duda
      // state.data = Integer.toString(model.getNotas()[posUno]);
      //Hay que tener en cuenta que en el botón se presenta
      //Un string por lo tanto y hay que tener en cuenta
      //la posicion del array que cogemos para cada boton
      state.btnUp = Integer.toString(model.getNotas()[posUno]);
      state.btnDown = Integer.toString(model.getNotas()[posDos]);
    }
  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // TODO: include code here if is necessary

  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    // TODO: include code here if is necessary
    view.get().onDataUpdated(state);
  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");

    // TODO: include code here if is necessary
  }

  @Override
  public void onPause() {
    // Log.e(TAG, "onPause()");

    // TODO: include code here if is necessary
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");

    // TODO: include code here if is necessary
  }


  @Override
  public void onHigherGradeBtnClicked() {

    // TODO: include code here if is necessary
    GradeToStudentState state = new GradeToStudentState();

    passStateToPreviousScreen(state);
    view.get().navigateToPreviousScreen();

  }

  @Override
  public void onLowerGradeBtnClicked() {

    // TODO: include code here if is necessary
    GradeToStudentState state = new GradeToStudentState();

    passStateToPreviousScreen(state);
    view.get().navigateToPreviousScreen();

  }

  private void passStateToPreviousScreen(GradeToStudentState state) {
    mediator.setPreviousGradeScreenState(state);
  }

  private StudentToGradeState getStateFromPreviousScreen() {
    return mediator.getPreviousGradeScreenState();
  }

  @Override
  public void injectView(WeakReference<GradeContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(GradeContract.Model model) {
    this.model = model;
  }

}
