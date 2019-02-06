package PerSemPhoneIILib;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



// DEBIRIUS HACKS!!!
public class PSPII_v2 implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("PerSemPhoneII (Semantical Research Engines)");
        GLCanvas canvas = new GLCanvas();

//        cl_ThBinDBL_v1_0 thBinDBL = new cl_ThBinDBL_v1_0(255.1267);
//        thBinDBL.start();
//        for(int it_0 = 0; it_0 < thBinDBL.getResBinC().length; it_0++) {
//            System.out.println(it_0 + "_res:" + thBinDBL.getResBinC()[it_0]);
//        }
        
        canvas.addGLEventListener(new PSPII_v2());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        cl_BaseObj_v1_0 cl_bVecArr[] = new cl_BaseObj_v1_0[300];
        for (int it_v = 0; it_v < cl_bVecArr.length; it_v++) {
            cl_bVecArr[it_v] = new cl_BaseObj_v1_0(new cl_Vector_v1_0(),0);
        }
        cl_BaseObj_v1_0 cl_bModArr[] = new cl_BaseObj_v1_0[100];
        for (int it_m = 0; it_m < cl_bModArr.length; it_m++) {
            cl_bModArr[it_m] = new cl_BaseObj_v1_0(new cl_Modul_v1_0(),0);
        }
        cl_BaseObj_v1_0 cl_bDDiscArr[] = new cl_BaseObj_v1_0[100];
        for (int it_d = 0; it_d < cl_bDDiscArr.length; it_d++) {
            cl_bDDiscArr[it_d] = new cl_BaseObj_v1_0(new cl_DataDisc_v1_0(),1);
        }
        cl_BaseObj_v1_0 cl_bCmpObjArr[] = new cl_BaseObj_v1_0[20];
        for (int it_c = 0; it_c < cl_bCmpObjArr.length; it_c++) {
            cl_bCmpObjArr[it_c] = new cl_BaseObj_v1_0(new cl_CMPObject_v1_0(),0);
        }
        cl_BaseObj_v1_0 cl_bOpObjArr[] = new cl_BaseObj_v1_0[20];
        for (int it_o = 0; it_o < cl_bOpObjArr.length; it_o++) {
            cl_bOpObjArr[it_o] = new cl_BaseObj_v1_0(new cl_OPObject_v1_0(),1);
        }
        cl_BaseObj_v1_0 cl_bEdgeArr[] = new cl_BaseObj_v1_0[20];
        for (int it_e = 0; it_e < cl_bEdgeArr.length; it_e++) {
            cl_bEdgeArr[it_e] = new cl_BaseObj_v1_0(new cl_EdgesObj_v1_0(),0);
        }
        cl_BaseObj_v1_0[][] baseArrObjects = new cl_BaseObj_v1_0[6][];
        baseArrObjects[0] = cl_bCmpObjArr;
        baseArrObjects[1] = cl_bOpObjArr;
        baseArrObjects[2] = cl_bDDiscArr;
        baseArrObjects[3] = cl_bModArr;
        baseArrObjects[4] = cl_bVecArr;
        baseArrObjects[5] = cl_bEdgeArr;
        
        cl_BaseSystem_v1_0 cl_bSys = new cl_BaseSystem_v1_0(baseArrObjects);
        // test init end
        // Dynamical Object init
        // set Shaped and Edges

        // Drawing Using Polygons
        gl.glBegin(GL.GL_POLYGON);
        
        gl.glEnd();
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

