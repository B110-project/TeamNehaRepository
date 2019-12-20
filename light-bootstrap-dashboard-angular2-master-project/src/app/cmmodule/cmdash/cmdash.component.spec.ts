import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CmdashComponent } from './cmdash.component';

describe('CmdashComponent', () => {
  let component: CmdashComponent;
  let fixture: ComponentFixture<CmdashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CmdashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CmdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
