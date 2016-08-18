package fr.reivon.formation.spring3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by reivaniel on 17/08/2016.
 */
public class VehiculeCollection {
        List<String> vehiculeList;
        Set<String> vehiculeSet;
        Map<Integer, String> vehiculeMap;
        Properties vehiculeProp;

        public void setVehiculeList(List addressList) {
            this.vehiculeList = addressList;
        }
        public List getVehiculeList() {
            System.out.println("List Elements :"  + vehiculeList);
            return vehiculeList;
        }

        public void setVehiculeSet(Set addressSet) {
            this.vehiculeSet = addressSet;
        }
        public Set getVehiculeSet() {
            System.out.println("Set Elements :"  + vehiculeSet);
            return vehiculeSet;
        }

        public void setVehiculeMap(Map addressMap) {
            this.vehiculeMap = addressMap;
        }
        public Map getVehiculeMap() {
            System.out.println("Map Elements :"  + vehiculeMap);
            return vehiculeMap;
        }

        public void setVehiculeProp(Properties vehiculeProp) {
            this.vehiculeProp = vehiculeProp;
        }
        public Properties getVehiculeProp() {
            System.out.println("Property Elements :"  + vehiculeProp);
            return vehiculeProp;
        }
}
