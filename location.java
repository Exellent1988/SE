private LocateMeVIew view;
private LocationCore core;

public void update(Locationmanaer manager, Location location){
core.setLocation(location);
Path path 0 core.calculatePath(lastLocation, location);
view.displayPath(path);
view.update();
}