package MVC;

public class Controller {
	Model _model;
	View _view;
	public Controller() {
		_model = new Model();
		_view = new View();
	}
	public void run() {
		_view.getInput(_model);
		_view.outputResult(_model.getSum(), _model.getSub());
	}
	@Override
	public String toString() {
		return "I am a Controller";
	}
}
