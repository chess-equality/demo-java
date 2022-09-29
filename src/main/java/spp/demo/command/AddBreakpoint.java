package spp.demo.command;

/**
 * This class is used to demonstrate the `Add Breakpoint` command.
 * <p>
 * <b>Usage:</b>
 * Open the Source++ Command Palette with `Ctrl+Shift+S` and search for `Add Breakpoint`.
 * </p>
 * <p>
 * <b>Command source code:</b>
 * <a href="https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/add-breakpoint/plugin.kts">Add Breakpoint</a>
 * </p>
 */
public class AddBreakpoint {

    /**
     * Execute the <b>Add Breakpoint</b> command with your cursor on line 28 to set up a non-breaking breakpoint
     * <b>after</b> that line. This will open the breakpoint configuration inlay. Hit enter to make the breakpoint
     * non-conditional. Hit enter again make the breakpoint single-use and create the breakpoint.
     * <p>
     * Once the breakpoint is created, the breakpoint status inlay will appear. This inlay will show the current
     * status of the breakpoint and will be marked as <b>Complete</b> once the breakpoint is hit. Once the breakpoint
     * is hit, the breakpoint status inlay can be expanded to show a table of the breakpoint hits. Clicking on a
     * breakpoint hit will open the breakpoint hit data in the traditional debugger variables view.
     * </p>
     */
    public void simpleBreakpoint() {
        double randomNumber = Math.random();
    }
}
