package trinsdar.gtsp.data;

import muramasa.antimatter.capability.machine.MachineItemHandler;
import muramasa.antimatter.gui.SlotType;
import trinsdar.gtsp.gui.SlotCoil;
import trinsdar.gtsp.gui.SlotDisplay;
import trinsdar.gtsp.machine.IBFItemHandler;

import java.util.Optional;

public class SlotTypes {
    public static SlotType COIL = new SlotType("coil_bf", (t, i, d) -> Optional.of(new SlotCoil(t, ((IBFItemHandler)t.itemHandler.orElse(null)).getCoilGuiHandler(), i, d.getX(), d.getY())));
    public static SlotType DISPLAY = new SlotType("display", (t, i, d) -> Optional.of(new SlotDisplay(t.itemHandler.map(MachineItemHandler::getInputHandler).orElse(null), i + 1, d.getX(), d.getY())));
}